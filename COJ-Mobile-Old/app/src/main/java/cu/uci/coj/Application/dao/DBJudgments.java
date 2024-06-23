package cu.uci.coj.Application.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DBJUDGMENTS".
 */
public class DBJudgments {

    private Long id;
    /** Not-null value. */
    private String judgment;

    public DBJudgments() {
    }

    public DBJudgments(Long id) {
        this.id = id;
    }

    public DBJudgments(Long id, String judgment) {
        this.id = id;
        this.judgment = judgment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getJudgment() {
        return judgment;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setJudgment(String judgment) {
        this.judgment = judgment;
    }

}
