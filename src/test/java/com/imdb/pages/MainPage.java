package com.imdb.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    @Step("Open main page imbd.com")
    public MainPage openMainPage() {
        open("https://www.imdb.com/");
        $("#home_img").shouldBe(Condition.visible);
        return this;
    }

    @Step("Open big side panel on main page")
    public MainPage openBigSidePanel() {
        $("#imdbHeader .ipc-button__text").click(); // исправить селектор т.к это просто 1я кнопка из 13 вот и кликает
        $("[data-testid='panel']").shouldBe(Condition.visible);
        return this;
    }

    @Step("Check sections on the big side panel")
    public MainPage clickSectionOnBigPanel(String sectionName) {
        $(byTagAndText("span", sectionName)).click();
        $("[data-testid='panel']").shouldBe(Condition.disappear);
        return this;
    }

    @Step("Open IMDB pro page")
    public MainPage openProPage() {
        $("#imdbHeader .navbar__imdbpro").click();
        $("[alt='IMDbPro']").shouldBe(Condition.visible);


        return this;
    }

}
