package cu.uci.coj.Application.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DBDRAFT_MESSAGE".
 */
public class DBDraftMessage {

    private Long id;
    /** Not-null value. */
    private String message;

    public DBDraftMessage() {
    }

    public DBDraftMessage(Long id) {
        this.id = id;
    }

    public DBDraftMessage(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getMessage() {
        return message;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setMessage(String message) {
        this.message = message;
    }

}
