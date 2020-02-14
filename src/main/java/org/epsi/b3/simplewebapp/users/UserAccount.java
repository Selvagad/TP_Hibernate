package org.epsi.b3.simplewebapp.users;

import java.util.Objects;
import java.util.zip.DataFormatException;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A business object the represents a User account.
 */
@Entity // il s’agit d’une classe à persister
@Table(name = "UserAccount")
public class UserAccount {

    private Integer idUser;
    private String userName;
    private Gender gender;
    private String password;

    public UserAccount() {

    }

    @Basic(optional = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic(optional = false)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Basic(optional = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public void validate() throws NullPointerException {
        Objects.requireNonNull(idUser, "idUser is the primary key and cannot be null");
        Objects.requireNonNull(userName, "The username is mandatory");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return Objects.deepEquals(idUser,that.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser);
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "idUser='" + idUser + '\'' +
                "userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", password='***'" +
                '}';
    }

}