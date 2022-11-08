package com.imdb.tests;

import com.imdb.pages.MainPage;
import org.junit.jupiter.api.Test;

public class WebUiTests {
    MainPage mainPage = new MainPage();

    @Test
    public void openMainPage(){
        mainPage.openMainPage()
                .openProPage();
    }
}
