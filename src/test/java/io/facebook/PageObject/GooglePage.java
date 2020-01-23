package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;

public class GooglePage extends BaseClass{
    private By searchField = By.name("q");
    private By searchButton = By.name("btnK");

    @Override
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
