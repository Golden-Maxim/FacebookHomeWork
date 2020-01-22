package PageObject;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MainPage {
    private By searchField = By.name("q");
    private By searcButton = By.className("gNO89b");


    public MainPage searchFacebook(){
        WebElement search =  DriverManager.getDriver().findElement(searchField);
        search.sendKeys("Facebook");

        return  new MainPage();
    }

    public ResultOfSearch clickButton(){
        WebElement button = DriverManager.getDriver().findElement(searcButton);
        button.click();

        return new ResultOfSearch();
    }
}
