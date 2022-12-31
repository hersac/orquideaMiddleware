package com.hersac.middleware;

public class User {
    private String userEmail;
    private String userPasswd;
    private String token;

    public User() {
        super();
    }

    public User(String userEmail, String userPasswd, String token) {
        super();
        this.userEmail = userEmail;
        this.userPasswd = userPasswd;
        this.token = token;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
