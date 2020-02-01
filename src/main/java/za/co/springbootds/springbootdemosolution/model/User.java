package za.co.springbootds.springbootdemosolution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 */

@Entity
public class User extends AbstractEntity {

    @Id
    @GeneratedValue
    private long id;
    private String firstname;
    private String surname;
    private String emailAddress;
    private String username;
    private String password;

    public User() {
    }

    public User(long id, String firstname, String surname, String emailAddress, String username, String password) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
