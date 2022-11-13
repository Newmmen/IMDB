package com.imdb.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:credentials.properties",
        "classpath:default.properties"
})

public interface WebConfig extends Config {

    @Key("user.email")
    String getUserEmail();

    @Key("user.name")
    String getUserName();

    @Key("user.password")
    String getUserPassword();

}
