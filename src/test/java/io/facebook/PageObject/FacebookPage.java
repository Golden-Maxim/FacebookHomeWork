package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookPage {

    private By emailField = By.xpath("//*[@id=\"email\"]");
    private By paswordField = By.xpath("//*[@id=\"pass\"]");
    private By buttonLogIn = By.xpath("//input[contains(@type,'submit')]");
    private By alertMessage = By.xpath("//div[contains(@role,'alert')]");


    public FacebookPage isUrl(String url) {

        if (DriverManager.getDriver().getCurrentUrl().equals(url)) {
            System.out.println("You are in the Facebook site");
        } else {
            System.out.println("Error!!!");
        }

        return new FacebookPage();
    }

    public FacebookPage enterWrongEmail(String login) {
        WebElement email = DriverManager.getDriver().findElement(emailField);
        email.sendKeys(login);

        return new FacebookPage();
    }

    public FacebookPage enterWrongPassword(String password) {
        WebElement email = DriverManager.getDriver().findElement(paswordField);
        email.sendKeys(password);

        return new FacebookPage();
    }

    public FacebookPage clickButtonLogIn() {
        WebElement button = DriverManager.getDriver().findElement(buttonLogIn);
        button.click();

        return new FacebookPage();
    }

    public String  identifyErrorMessage(){
        String alert = DriverManager.getDriver().findElement(alertMessage).getText();

        return alert;
    }
}
