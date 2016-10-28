package org.cqm.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@NamedQuery(name = "Users.getAll", query = "select c from Users c")

public class Users {
    @Id
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

}



