package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private By searchField = By.name("q");
    private By searcButton = By.className("gNO89b");

    public GooglePage navigateTo(String url) {
        DriverManager.getDriver().get(url);

        return this;
    }

    public GooglePage searchFacebook(){
        WebElement search =  DriverManager.getDriver().findElement(searchField);
        search.sendKeys("Facebook");

        return this;
    }

    public ResultOfSearch clickButton(){
        WebElement button = DriverManager.getDriver().findElement(searcButton);
        button.click();

        return new ResultOfSearch();
    }
}
