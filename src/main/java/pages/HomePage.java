package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;

public class HomePage extends BaseClass
{
    private final By sideNavBtnXpath =new By.ByXPath(HomePageObject.sideNavButtonLink);
    private final By logoutBtnXpath = new By.ByXPath(HomePageObject.logoutBtnLink);
    private final By resetDataBtnXpath = new By.ByXPath(HomePageObject.resetDataBtnLink);
    private final By sideNavXpath = new By.ByXPath(HomePageObject.sidenavLink);
    private final By addMatchXpath = new By.ByXPath(HomePageObject.addMatchBtnLink);
    private final By standingsBtnXpath = new By.ByXPath(HomePageObject.standingsBtnLink);
    private final By playerBtnXpath = new By.ByXPath(HomePageObject.playersBtnLink);
    private final By teamsBtnXpath = new By.ByXPath(HomePageObject.teamsBtnLink);

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
        driver.findElement(teamsBtnXpath).click();
    }

}
