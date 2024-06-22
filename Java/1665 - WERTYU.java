import java.util.*;

public class COJ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena, salida;
		int i;
		  
		  while (sc.hasNextLine()) {
		   cadena = sc.nextLine();
		   salida = "";
		   
		   for (i = 0; i < cadena.length(); i++) {
		    switch (cadena.charAt(i)) {
		    case 'W':
		     salida += 'Q';
		     break;
		    case 'S':
		     salida += 'A';
		     break;
		    case 'X':
		     salida += 'Z';
		     break;
		    case 'E':
		     salida += 'W';
		     break;
		    case 'D':
		     salida += 'S';
		     break;
		    case 'C':
		     salida += 'X';
		     break;
		    case 'R':
		     salida += 'E';
		     break;
		    case 'F':
		     salida += 'D';
		     break;
		    case 'V':
		     salida += 'C';
		     break;
		    case 'T':
		     salida += 'R';
		     break;
		    case 'G':
		     salida += 'F';
		     break;
		    case 'B':
		     salida += 'V';
		     break;
		    case 'Y':
		     salida += 'T';
		     break;
		    case 'H':
		     salida += 'G';
		     break;
		    case 'N':
		     salida += 'B';
		     break;
		    case 'U':
		     salida += 'Y';
		     break;
		    case 'J':
		     salida += 'H';
		     break;
		    case 'M':
		     salida += 'N';
		     break;
		    case 'I':
		     salida += 'U';
		     break;
		    case 'K':
		     salida += 'J';
		     break;
		    case ',':
		     salida += 'M';
		     break;
		    case 'O':
		     salida += 'I';
		     break;
		    case 'L':
		     salida += 'K';
		     break;
		    case '.':
		     salida += ',';
		     break;
		    case 'P':
		     salida += 'O';
		     break;
		    case ';':
		     salida += 'L';
		     break;
		    case '/':
		     salida += '.';
		     break;
		    case '2':
		     salida += '1';
		     break;
		    case '3':
		     salida += '2';
		     break;
		    case '4':
		     salida += '3';
		     break;
		    case '5':
		     salida += '4';
		     break;
		    case '6':
		     salida += '5';
		     break;
		    case '7':
		     salida += '8';
		     break;
		    case '8':
		     salida += '7';
		     break;
		    case '9':
		     salida += '8';
		     break;
		    case '0':
		     salida += '9';
		     break;
		    case '-':
		     salida += '0';
		     break;
		    case '=':
		     salida += '-';
		     break;
		    case '[':
		     salida += 'P';
		     break;
		    case ']':
		     salida += '[';
		     break;
		    case '\\':
		     salida += ']';
		     break;
		    case '\'':
		     salida += ';';
		     break;
		    case ' ':
		     salida += ' ';
		     break;
		    }
		   }
		   System.out.println(salida);
		}
	}
}
