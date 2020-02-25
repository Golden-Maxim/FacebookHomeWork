package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;

public class GooglePage {
    private By searchField = By.name("q");
    private By searchButton = By.name("btnK");


    public GooglePage navigateTo(String url) {
        DriverManager.getChromeDriver().get(url);

        return this;
    }

    public GooglePage searchFacebook() {
        DriverManager.getChromeDriver().findElement(searchField).sendKeys("Facebook");

        return this;
    }

    public ResultOfSearch clickButton() {
        DriverManager.getChromeDriver().findElement(searchButton).submit();

        return new ResultOfSearch();
    }
}
