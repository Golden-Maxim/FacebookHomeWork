package PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultOfSearch {
    private By linkLogIn = By.xpath("//a[@href=\"https://www.facebook.com/\"]");


    public FacebookPage enterInFacebookPage(){
        WebElement link = DriverManager.getDriver().findElement(linkLogIn);
        link.click();

        return new FacebookPage();
    }
}

