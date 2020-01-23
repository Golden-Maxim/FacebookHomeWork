package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;

public class ResultOfSearch {
    private By linkLogIn = By.xpath("//a[@href=\"https://www.facebook.com/\"]");


    public FacebookPage enterInFacebookPage() {
        DriverManager.getDriver().findElement(linkLogIn).click();

        return new FacebookPage();
    }
}

