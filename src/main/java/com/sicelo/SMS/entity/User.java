package com.sicelo.SMS.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    private String userId;
    private String password;

    public User(){
    }

    public User(String userID, String password){
        this.userId = userID;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
