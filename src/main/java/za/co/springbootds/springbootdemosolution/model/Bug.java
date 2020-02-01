package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Date;

@Entity
public class Bug extends AbstractEntity {

    @Id
    @GeneratedValue
    private long id;
    private String summary;
    private String description;
    private Status status;
    private BugCategory bugCategory;
    private User assignedUser;
    private Collection<BugComment> bugComments;

    public Bug() {
    }

    public Bug(long id, String summary, String description, Status status, BugCategory bugCategory, User assignedUser, Collection<BugComment> bugComments, User createUser, Date createDate, User modifyUser, Date modifyDate) {
        super(createUser, createDate, modifyUser, modifyDate);
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.status = status;
        this.bugCategory = bugCategory;
        this.assignedUser = assignedUser;
        this.bugComments = bugComments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BugCategory getBugCategory() {
        return bugCategory;
    }

    public void setBugCategory(BugCategory bugCategory) {
        this.bugCategory = bugCategory;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Collection<BugComment> getBugComments() {
        return bugComments;
    }

    public void setBugComments(Collection<BugComment> bugComments) {
        this.bugComments = bugComments;
    }

}
