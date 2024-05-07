package pages;

import baseClass.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import pageObjects.WelcomePageObject;

public class WelcomePage extends BaseClass{

    private final By nextBtnXpath =new By.ByXPath(WelcomePageObject.nextBtnLink);
    private final By skipBtnXpath =new By.ByXPath(WelcomePageObject.skipBtnLink);

    public void Carousel(){
        driver.findElement(nextBtnXpath).click();
        driver.findElement(nextBtnXpath).click();
        driver.findElement(nextBtnXpath).click();
    }

    public void SkipWelcome()  {
        driver.findElement(skipBtnXpath).click();
    }
}
