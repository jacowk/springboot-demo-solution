package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AbstractEntity {

    private User createUser;
    private Date createDate;
    private User modifyUser;
    private Date modifyDate;

    public AbstractEntity() {
    }

    public AbstractEntity(User createUser, Date createDate, User modifyUser, Date modifyDate) {
        this.createUser = createUser;
        this.createDate = createDate;
        this.modifyUser = modifyUser;
        this.modifyDate = modifyDate;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(User modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

}
