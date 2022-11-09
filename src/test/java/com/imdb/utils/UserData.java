package com.imdb.utils;

public class UserData {
    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    private  String userEmail = System.getProperty("user.email");
    private String userName = System.getProperty("user.name");
    private String userPassword = System.getProperty("user.password");

}
