package com.imdb.tests;

import com.imdb.pages.LoginPage;
import com.imdb.pages.MainPage;
import com.imdb.testbase.Attach;
import com.imdb.testbase.TestBase;
import com.imdb.utils.UserData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("webtests")
public class WebUiTests extends TestBase {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    UserData user = new UserData();


    @Test
    @DisplayName("Open main page IMDB.com")
    public void openMainPage() {
        mainPage.openMainPage();
        Attach.addAttachments();

    }

    @Test
    @DisplayName("Open main page IMDB pro page")
    public void openImdbProPage() {
        mainPage.openMainPage()
                .openProPage();

    }

    @Test
    @DisplayName("Open big side panel")
    public void OpenBigSidePanel() {
        mainPage.openMainPage()
                .openBigSidePanel();

    }

    @Test
    @DisplayName("Open section on big side panel")
    public void OpenSectionOnSidePanel() {
        mainPage.openMainPage()
                .openBigSidePanel()
                .clickSectionOnBigPanel("TV News");

    }

    @Test
    @DisplayName("Login with IMDB account")
    public void loginWithImdbAccount() {

        mainPage.openMainPage()
                .openLoginPage();
        loginPage.clickLoginImdbAcc()
                .loginWithImdbAccount(user.getUserEmail(), user.getUserName(), user.getUserPassword());


    }

    @Test
    @DisplayName("Login with empty data IMDB account")
    public void checkLoginEmptyDataImdbAccount() {
        mainPage.openMainPage()
                .openLoginPage();
        loginPage.clickLoginImdbAcc()
                .clickLoginWithEmptyImdbAccount();


    }

    @Test
    @DisplayName("Sign out from IMDB account")
    public void signOutFromImdbAccount() {
        mainPage.openMainPage()
                .openLoginPage();
        loginPage.clickLoginImdbAcc()
                .loginWithImdbAccount(user.getUserEmail(), user.getUserName(), user.getUserPassword());
        mainPage.signOutFromAccount(user.getUserName());


    }


}
