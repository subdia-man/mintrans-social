package ru.mintrans.mintransstartsocial.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private boolean isAdministrator = false;

    @Temporal(TemporalType.DATE)
    private Date dob;
    public User() {
        super();
    }
    public User(String firstname, String lastname, Date dob) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
    }

    public User(String firstname, String lastname, Date dob, boolean isAdministrator) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
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
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public boolean isAdministrator() {
        return isAdministrator;
    }
    public void setIsAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", " +
                "isAdministrator= " + isAdministrator + "]";
    }
}
