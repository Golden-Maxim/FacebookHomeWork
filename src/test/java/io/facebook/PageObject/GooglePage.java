package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;

public class GooglePage {
    private By searchField = By.name("q");
    private By searchButton = By.name("btnK");


    public GooglePage navigateTo(String url) {
        DriverManager.getDriver().get(url);

        return this;
    }

    public GooglePage searchFacebook() {
        DriverManager.getDriver().findElement(searchField).sendKeys("Facebook");

        return this;
    }

    public ResultOfSearch clickButton() {
        DriverManager.getDriver().findElement(searchButton).submit();

        return new ResultOfSearch();
    }
}
