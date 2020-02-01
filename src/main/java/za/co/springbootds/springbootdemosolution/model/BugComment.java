package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BugComment extends AbstractEntity {

    @Id
    @GeneratedValue
    private long id;
    private String comment;
    private Bug bug;

    public BugComment() {
    }

    public BugComment(long id, String comment, Bug bug, User createUser, Date createDate, User modifyUser, Date modifyDate) {
        super(createUser, createDate, modifyUser, modifyDate);
        this.id = id;
        this.comment = comment;
        this.bug = bug;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

}
