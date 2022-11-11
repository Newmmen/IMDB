package com.imdb.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    @Step("Choose signing option Sign in with IMDb")
    public LoginPage clickLoginImdbAcc() {
        $("#signin-options").find(byText("Sign in with IMDb")).click();
        $("#ap_email").shouldBe(Condition.visible);
        return this;

    }

    @Step("Login with IMDB account")
    public LoginPage loginWithImdbAccount(String loginEmail, String userName, String password) {
        $("#ap_email").setValue(loginEmail);
        $("#ap_password").setValue(password);
        $("#signInSubmit").click();
        $("#imdbHeader").find(byText(userName)).shouldBe(Condition.visible);

        return this;
    }

    @Step("Login with empty Imdb account data")
    public LoginPage clickLoginWithEmptyImdbAccount() {
        $("#signInSubmit").click();
        $(".a-section").find(byText("Enter your email or mobile phone number")).shouldBe(Condition.visible);
        $(".a-section").find(byText("Enter your password")).shouldBe(Condition.visible);

        return this;
    }

}
