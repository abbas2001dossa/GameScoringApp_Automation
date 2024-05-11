package pages;

import baseClass.BaseClass;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;

import java.time.Duration;
import java.util.Collections;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HomePage extends BaseClass
{
    private final By sideNavBtnXpath =new By.ById("00000000-0000-0318-ffff-ffff00000049");
    private final By logoutBtnXpath = new By.ByXPath(HomePageObject.logoutBtnLink);
    private final By resetDataBtnXpath = new By.ByXPath(HomePageObject.resetDataBtnLink);
    private final By sideNavXpath = new By.ByXPath(HomePageObject.sidenavLink);
    private final By addMatchXpath = new By.ByXPath(HomePageObject.addMatchBtnLink);
    private final By standingsBtnXpath = new By.ByXPath(HomePageObject.standingsBtnLink);
    private final By playerBtnXpath = new By.ByXPath(HomePageObject.playersBtnLink);
    private final By teamsBtnXpath = new By.ByXPath(HomePageObject.teamsBtnLink);
    private final By yesBtnXpath = new By.ByXPath(HomePageObject.yesBtnLink);


    public void logout ()
    {
        driver.findElement(sideNavBtnXpath).click();
        driver.findElement(logoutBtnXpath).click();
    }

    public void openAddMatch (){
        driver.findElement(addMatchXpath).click();
    }

    public void openStandings (){
        driver.findElement(standingsBtnXpath).click();
    }

    public void openPlayers (){
        driver.findElement(playerBtnXpath).click();
    }

    public void openTeams (){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(
//                ExpectedConditions.presenceOfElementLocated(teamsBtnXpath)
//        );
        driver.findElement(teamsBtnXpath).click();
    }

    public void horizontalScroll () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Find the element by accessibility ID
        RemoteWebElement carousel = (RemoteWebElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAccessibilityId("Add Match"))
        );

        // Swipe parameters
        int swipeDistance = (int) (driver.manage().window().getSize().getWidth() * 0.50); // Half of the screen width
        int swipeDuration = 500; // Duration in milliseconds

        // Execute swipe gesture
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", carousel.getId(), // Use the element's ID
                "direction", "left", // Swipe direction
                "percent", 0.75, // Swipe length as a percentage of the screen width
                "duration", swipeDuration // Swipe duration
        ));
    }

    public void resetData (){
        driver.findElement(sideNavBtnXpath).click();
        driver.findElement(resetDataBtnXpath).click();
        driver.findElement(yesBtnXpath).click();
    }
}
