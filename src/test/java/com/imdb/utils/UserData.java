package com.imdb.utils;

import com.imdb.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;

public class UserData {
    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    private String userEmail = config.getUserEmail();
    private String userName = config.getUserName();
    private String userPassword = config.getUserPassword();

}
