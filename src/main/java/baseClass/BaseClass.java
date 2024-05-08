package baseClass;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pageObjects.LoginPageObject;
import pageObjects.WelcomePageObject;
import pages.HomePage;
import pages.WelcomePage;
import utils.AppiumDriver;
import utils.Constants;

public class BaseClass {

    public static AndroidDriver driver ;
    private final static By skipBtnXpath =new By.ByXPath(WelcomePageObject.skipBtnLink);
    private final static By inputEmailXpath =new By.ByXPath(LoginPageObject.inputEmailLink);
    private final static By inputPasswordXpath = new By.ByXPath(LoginPageObject.inputPasswordLink);
    private final static By loginBtnLink = new By.ByXPath(LoginPageObject.loginBtnLink);


    public static void setUp() {
        driver = AppiumDriver.getAppiumDriver();
    }


    public static  void tearDown() {
        if (driver != null) {

            driver.quit(); // Ensure the session is properly closed
        }
    }

    public static void Login ()
    {
        driver.findElement(skipBtnXpath).click();
        driver.findElement(inputEmailXpath).sendKeys(Constants.email);
        driver.findElement(inputPasswordXpath).sendKeys(Constants.password);
        driver.findElement(loginBtnLink).click();
    }

}
