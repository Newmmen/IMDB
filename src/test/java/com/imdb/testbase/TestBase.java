package com.imdb.testbase;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.imdb.testbase.AttachHelper.*;

public class TestBase {


    @BeforeAll
    static void configure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        if (System.getProperty("selenide.remote") != null) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = "http://localhost:4444/wd/hub/";//System.getProperty("selenide.remote");
        }
       // Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.browser = System.getProperty("browser", "chrome");
       // Configuration.browserVersion = System.getProperty("browser_version", "99.0");

    }
    @AfterEach
    public void addAttachments(){
        takeScreenShot();
        addPageSource();
        if(System.getProperty("selenide.remote") != null) {
            addVideo();
        }
        browserConsoleLog();
        Selenide.closeWebDriver();

    }
}

