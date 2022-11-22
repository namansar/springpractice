package com.deqode.backend2.springpractice.entity;


import java.io.Serializable;

public class AuthRequest implements Serializable {

    private String username;
    private String password;

    public AuthRequest() {
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


    public AuthRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

}
