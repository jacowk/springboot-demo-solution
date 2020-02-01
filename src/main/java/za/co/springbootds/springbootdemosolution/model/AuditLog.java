package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue
    private long id;
    private String description;
    private AuditCategory auditCategory;
    private User auditUser;
    private Date auditDate;

    public AuditLog() {
    }

    public AuditLog(long id, String description, AuditCategory auditCategory, User auditUser, Date auditDate) {
        this.id = id;
        this.description = description;
        this.auditCategory = auditCategory;
        this.auditUser = auditUser;
        this.auditDate = auditDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AuditCategory getAuditCategory() {
        return auditCategory;
    }

    public void setAuditCategory(AuditCategory auditCategory) {
        this.auditCategory = auditCategory;
    }

    public User getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(User auditUser) {
        this.auditUser = auditUser;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

}
