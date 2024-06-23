/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.uci.coj.restapi.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import cu.uci.coj.dao.UserDAO;
import cu.uci.coj.mail.MailNotificationService;
import cu.uci.coj.model.User;
import cu.uci.coj.restapi.templates.ApiRest;
import cu.uci.coj.restapi.templates.InputForgotPasswordRest;
import cu.uci.coj.restapi.templates.InputGenerateApiRest;
import cu.uci.coj.restapi.templates.InputUserRest;
import cu.uci.coj.restapi.templates.TokenRest;
import cu.uci.coj.restapi.utils.ErrorUtils;
import cu.uci.coj.restapi.utils.TokenUtils;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import org.hibernate.validator.constraints.impl.EmailValidator;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author cesar
 */
@Controller
@RequestMapping("/private")
public class RestPrivateController {
    
    @Resource
    protected JdbcTemplate jdbcTemplate;
    @Resource
    private UserDAO userDAO;
    @Resource
    protected MessageSource messageSource;
    @Resource
    private MailNotificationService mailNotificationService;
    
    
    @ApiOperation(value = "Autentificar un Usuario",  
            notes = "Autentica un usuario, de ser correcto devuelve un token con el que se podrá acceder a los demás métodos privados.",
            response = TokenRest.class)
    @ApiResponses(value = { @ApiResponse(code = 401, message = "username token mismatch<br> hash incorrect<br> token expirated<br> username apikey mismatch<br> apikey hash incorrect<br> apikey expirated<br> apikey secret incorrect<br> token or apikey incorrect"),
                            @ApiResponse(code = 400, message = "incorrect request")  })
    @RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> CreateToken(
            @ApiParam(value = "JSON con el envío") @RequestBody InputUserRest bodyjson){
        try {
            
            int error = ValidateApi(bodyjson.getApikey());
            if (error > 0) {
                return new ResponseEntity<>(TokenUtils.ErrorMessage(error), HttpStatus.UNAUTHORIZED);
            }

            String username = bodyjson.getUsername();
            String password = bodyjson.getPassword();
            
            String sql = "SELECT * FROM public.users WHERE username = ?";
            
            try{
                User user =  (User) jdbcTemplate.queryForObject(sql,new Object[]{username},new BeanPropertyRowMapper(User.class));
                PasswordEncoder encoder = new Md5PasswordEncoder();
                password = encoder.encodePassword(password,"ABC123XYZ789");

                if(user.getPassword().equals(password)){
                    TokenRest token = new TokenRest(TokenUtils.CreateTokenUser(username), TokenUtils.expirityToken);
                    return  new ResponseEntity<>(token, HttpStatus.OK);
            }
            else
                return  new ResponseEntity<>(ErrorUtils.BAD_USERNAME_PASSWORD, HttpStatus.UNAUTHORIZED);
            
            
            }catch(Exception e){
                return  new ResponseEntity<>(ErrorUtils.BAD_USERNAME_PASSWORD, HttpStatus.UNAUTHORIZED);
            }
           

        } catch (IOException ex) {
           return new ResponseEntity<>(TokenUtils.ErrorMessage(8), HttpStatus.BAD_REQUEST);
        }

    }
    
    @ApiOperation(value = "Recuperar contraseña olvidada",  
            notes = "Envía un correo al usuario para cambiar la contraseña vía sitio COJ.")
    @ApiResponses(value = { @ApiResponse(code = 401, message = "username apikey mismatch<br> apikey hash incorrect<br> apikey expirated<br> apikey secret incorrect<br> bad username or password"),
                            @ApiResponse(code = 404, message = "invalid email"),
                            @ApiResponse(code = 500, message = "error update code<br> failed send email"),
                            @ApiResponse(code = 400, message = "incorrect request")})
    @RequestMapping(value = "/forgottenpassword", method = RequestMethod.POST, headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> ForgottenPassword(
            @ApiParam(value = "JSON con el envío") @RequestBody InputForgotPasswordRest bodyjson){
        try {
            Locale locale = new Locale("en");

            int error = ValidateApi(bodyjson.getApikey());
            if (error > 0) {
                return new ResponseEntity<>(TokenUtils.ErrorMessage(error), HttpStatus.UNAUTHORIZED);
            }
            
            String passcode;
            
            if (!ValidateEmail(bodyjson.getEmail())) 
                return new ResponseEntity<>(ErrorUtils.INVALID_EMAIL,HttpStatus.NOT_FOUND);
            
            try {
                passcode = generateRandomPassword(30);
                userDAO.dml("update.passcode", passcode, bodyjson.getEmail());
            } catch (Exception e) {
                return new ResponseEntity<>(ErrorUtils.ERROR_UPDATE_CODE,HttpStatus.INTERNAL_SERVER_ERROR);
            }
            String subject = messageSource.getMessage("mail.pass.recover.subject", new Object[0], java.util.Locale.ENGLISH);
            String msg = messageSource.getMessage("forgotten.password", new Object[]{passcode}, locale);
            try {
                mailNotificationService.sendForgottenPasswordEmail(bodyjson.getEmail(), subject, msg);
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(ErrorUtils.FAILED_SEND_EMAIL,HttpStatus.INTERNAL_SERVER_ERROR);
            }
            

        } catch (IOException ex) {
           return new ResponseEntity<>(TokenUtils.ErrorMessage(8), HttpStatus.BAD_REQUEST);
        }

    }
    
    
    @ApiOperation(value = "Generar una llave de desarrollador",  
            notes = "Crea una llave de desarrollador para comenzar a utilizar la Capa de servicios Web.",
            response = ApiRest.class)
    @ApiResponses(value = { @ApiResponse(code = 404, message = "bad user"),
                            @ApiResponse(code = 401, message = "bad username or password") })
    @RequestMapping(value = "/generateapi", method = RequestMethod.POST, headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> GenerateAPI(
            @ApiParam(value = "JSON con el envío") @RequestBody InputGenerateApiRest bodyjson){
            
            if(!userDAO.isUser(bodyjson.getUsername()))
                return new ResponseEntity<>(ErrorUtils.BAD_USER, HttpStatus.NOT_FOUND);
            
            String sql = "SELECT * FROM public.users WHERE username = ?";
          
           
            User user =  (User) jdbcTemplate.queryForObject(sql,new Object[]{bodyjson.getUsername()},new BeanPropertyRowMapper(User.class));
            PasswordEncoder encoder = new Md5PasswordEncoder();
            String password = encoder.encodePassword(bodyjson.getPassword(),"ABC123XYZ789");

            if(!user.getPassword().equals(password))
                return  new ResponseEntity<>(ErrorUtils.BAD_USERNAME_PASSWORD, HttpStatus.UNAUTHORIZED);               
            
            String apiKey = TokenUtils.CreateAPIKey(bodyjson.getUsername(), password);
            
            return new ResponseEntity<>(new ApiRest(apiKey, TokenUtils.expirityAPIKey),HttpStatus.OK);



    }
    
    
    private boolean ValidateEmail(String email){
        EmailValidator a = new EmailValidator();
        if (!a.isValid(email, null))
            return false; 
        
        try {
            boolean emailExist = userDAO.bool("exist.user.bymail", email);
            if (!emailExist) 
                return false;
                    
        } catch (Exception e) {return false;}
        
        return true;
    }
   
    private int ValidateApi(String apikey) throws IOException {
        //ObjectMapper mapper = new ObjectMapper();
        //JsonNode node = mapper.readValue(bodyjson, JsonNode.class);

       /* if (!node.has("apikey")) {
            return 8;
        }*/

        try {
            int error = TokenUtils.ValidateAPIKey(apikey);
            if (error > 0) {
                return error;
            }          
        } catch (Exception e) {
            return 9;
        }

        return 0;
    }
    
    
    private int ValidateApiAndToken(String bodyjson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readValue(bodyjson, JsonNode.class);

        if (!node.has("apikey") || !node.has("token")) {
            return 8;
        }

        String apikey = node.get("apikey").textValue();
        String token = node.get("token").textValue();

        try {
            int error = TokenUtils.ValidateAPIKey(apikey);
            if (error > 0) {
                return error;
            }

            int error2 = TokenUtils.ValidateTokenUser(token);
            if (error2 > 0) {
                return error2;
            }
        } catch (Exception e) {
            return 9;
        }

        return 0;
    }
    
    
    private String ExtractUser(String token) {
        String username = null;
        try {
            username = TokenUtils.getUsernameFromToken(token);
        } catch (Exception ex) {
            Logger.getLogger(RestProblemsController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return username;
    }  
    
    
    private String generateRandomPassword(int length) {
        String password = "";
        for (int i = 0; i < length; i++) {
            Random r = new Random();
            password += (char) ('A' + r.nextInt(26));
        }
        password = password.toLowerCase();
        return password;
    }

    
    
}
