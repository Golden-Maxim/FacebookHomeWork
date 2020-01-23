package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager(){}

    public static WebDriver getDriver(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
            /*ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=es");
            ChromeDriver driver = new ChromeDriver(options);*/
        }
        return driver;
    }

    public static void killDriver(){
        driver.close();
        if(driver != null ){
            driver = null;
        }
    }
}
