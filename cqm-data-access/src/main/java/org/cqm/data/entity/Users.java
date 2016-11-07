package org.cqm.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@NamedQuery(name = "Users.getAll", query = "select c from Users c")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "catalog_seq")
    private Integer userId;

    @Column (name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "login")
    private String userLogin;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "hash")
    private String hashPassword;

    @Column(name = "salt")
    private String saltPassword;

    @Column(name = "rating")
    private int userRating;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    public Users(Integer userId, String firstName, String lastName, String userLogin, String userEmail, String hashPassword, String saltPassword, int userRating, boolean isAdmin) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userLogin = userLogin;
        this.userEmail = userEmail;
        this.hashPassword = hashPassword;
        this.saltPassword = saltPassword;
        this.userRating = userRating;
        this.isAdmin = isAdmin;
    }

    public Users() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getSaltPassword() {
        return saltPassword;
    }

    public void setSaltPassword(String saltPassword) {
        this.saltPassword = saltPassword;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", hashPassword='" + hashPassword + '\'' +
                ", saltPassword='" + saltPassword + '\'' +
                ", userRating=" + userRating +
                ", isAdmin=" + isAdmin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userRating != users.userRating) return false;
        //if (isAdmin != users.isAdmin) return false;
        if (userId != null ? !userId.equals(users.userId) : users.userId != null) return false;
        if (firstName != null ? !firstName.equals(users.firstName) : users.firstName != null) return false;
        if (lastName != null ? !lastName.equals(users.lastName) : users.lastName != null) return false;
        if (userLogin != null ? !userLogin.equals(users.userLogin) : users.userLogin != null) return false;
        if (userEmail != null ? !userEmail.equals(users.userEmail) : users.userEmail != null) return false;
        if (hashPassword != null ? !hashPassword.equals(users.hashPassword) : users.hashPassword != null) return false;
        return saltPassword != null ? saltPassword.equals(users.saltPassword) : users.saltPassword == null;

    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (hashPassword != null ? hashPassword.hashCode() : 0);
        result = 31 * result + (saltPassword != null ? saltPassword.hashCode() : 0);
        result = 31 * result + userRating;
        //result = 31 * result + (isAdmin ? 1 : 0);
        return result;
    }
}



