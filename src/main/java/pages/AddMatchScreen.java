package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.AddMatchScreenObjects;
import pageObjects.AddPlayerPageObject;

public class AddMatchScreen extends BaseClass
{
    private final By addNewMatchBtnXpath =new By.ByXPath(AddMatchScreenObjects.addNewMatchBtnXpath);
    private final By toggleBtnTeamXpath = new By.ByXPath(AddMatchScreenObjects.toggleButtonTeamXpath);
    private final By toggleBtnIndXpath = new By.ByXPath(AddMatchScreenObjects.toggleButtonIndXpath);
    private final By goBackXpath = new By.ByXPath(AddMatchScreenObjects.goBackXpath);

    private final By AddTeamMatchToggleXpath = new By.ByXPath(AddMatchScreenObjects.AddTeamMatchToggleXpath);
    private final By AddIndMatchToggleXpath = new By.ByXPath(AddMatchScreenObjects.AddIndMatchToggleXpath);

    // Add Match Team
    private final By teamTextXpath = new By.ByXPath(AddMatchScreenObjects.teamTextXpath);
    private final By addNewTeamXpath = new By.ByXPath(AddMatchScreenObjects.addNewTeamXpath);
    private final By team1DropdownXpath = new By.ByXPath(AddMatchScreenObjects.team1DropDownXpath);
    private final By team2DropdownXpath = new By.ByXPath(AddMatchScreenObjects.team2DropdownXpath);
    private final By submitBtnTeamXpath = new By.ByXPath(AddMatchScreenObjects.submitBtnTeamXpath);
    private final By goBackFromTeamMatchXpath = new By.ByXPath(AddMatchScreenObjects.goBackFromTeamMatchXpath);

    // Add Individal Team
    private final By individualTextXpath = new By.ByXPath(AddMatchScreenObjects.individualTextXpath);
    private final By player1DropdownXpath = new By.ByXPath(AddMatchScreenObjects.player1DropDownXpath);
    private final By player2DropdownXpath = new By.ByXPath(AddMatchScreenObjects.player2DropDownXpath);
    private final By submitBtnIndividualXpath = new By.ByXPath(AddMatchScreenObjects.submitBtnIndividualXpath);
    private final By goBackFromIndividualMatchXpath = new By.ByXPath(AddMatchScreenObjects.goBackFromIndividualMatchXpath);



    public void NavigateToAddTeamFromTeamMatch () throws InterruptedException {
        driver.findElement(addNewMatchBtnXpath).click();
        String txt = driver.findElement(teamTextXpath).getText();
        Assert.assertEquals(txt,AddMatchScreenObjects.teamText);
        Thread.sleep(2000);
        driver.findElement(team1DropdownXpath).click();
        driver.findElement(addNewTeamXpath).click();
    }

    public void addIndividualMatch(){

    }


    public void addTeamMatch(){

    }


}
