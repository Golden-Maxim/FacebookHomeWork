package io.facebook;

import PageObject.StartPage;
import core.DriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run {
    @Test
    public void facebookTest(){
        String test = new StartPage().navigateTo("https://www.google.com/")
                .searchFacebook().
                clickButton()
                .enterInFacebookPage()
                .isUrl("https://www.facebook.com/")
                .enterWrongEmail("badlogin")
                .enterWrongPassword("badpassword")
                .clickButtonLogIn().identifyErrorMessage();
        Assert.assertTrue(test.contains("The email or phone number you’ve entered doesn’t match any account. Sign up for an account."));
    }

}
