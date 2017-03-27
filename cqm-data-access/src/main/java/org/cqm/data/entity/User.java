package org.cqm.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@NamedQuery(name = "Users.getAll", query = "select c from User c")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "cqm_id_sequence")
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "login")
    private String login;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Transient
    private String confirmPassword;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    private Integer rank = 0;



    public User(Integer userId, String login, String email, String password, Integer rating, Boolean isAdmin) {
        this.userId = userId;
        this.login = login;
        this.email = email;
        this.password = password;
        this.rating = rating;
        this.isAdmin = isAdmin;
    }

    public User (String login, String email, String password, String confirmPassword){
        this.login = login;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.rating = 0;
        this.isAdmin = false;
    }

    public User() {
    }

    public Integer getId() {
        return userId;
    }

    public void setId(Integer userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", userEmail='" + email + '\'' +
                ", hashPassword='" + password + '\'' +
                ", userRating=" + rating +
                ", isAdmin=" + isAdmin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (rating != user.rating) return false;
        if (isAdmin != user.isAdmin) return false;
        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        return password != null ? !password.equals(user.password) : user.password == null;

    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + rating;
        result = 31 * result + (isAdmin ? 1 : 0);
        return result;
    }

}
