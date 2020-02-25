package io.facebook.PageObject;

import core.DriverManager;
import org.openqa.selenium.By;

public class FacebookPage {

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By buttonLogIn = By.xpath("//input[contains(@type,'submit')]");
    private By alertMessage = By.xpath("//div[contains(@role,'alert')]");


  public FacebookPage navigateTo(String url) {
      DriverManager.getChromeDriver().get(url);

      return this;
  }

    public String isUrl(String url) {
        return  DriverManager.getChromeDriver().getCurrentUrl();
    }

    public FacebookPage enterWrongEmail(String login) {
        DriverManager.getChromeDriver().findElement(emailField).sendKeys(login);

        return new FacebookPage();
    }

    public FacebookPage enterWrongPassword(String password) {
         DriverManager.getChromeDriver().findElement(passwordField).sendKeys(password);

        return this;
    }

    public FacebookPage clickButtonLogIn() {
         DriverManager.getChromeDriver().findElement(buttonLogIn).click();

        return this;
    }

    public String identifyErrorMessage() {
        return DriverManager.getChromeDriver().findElement(alertMessage).getText();

    }
}
