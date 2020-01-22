package PageObject;

import core.DriverManager;

public class StartPage {
    public static MainPage navigateTo(String url){
        DriverManager.getDriver().get(url);
        return  new MainPage();
    }
}
