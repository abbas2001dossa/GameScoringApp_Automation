package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import pageObjects.AddTeamPageObject;

public class AddTeamPage extends BaseClass {

    private final By addNewTeamBtnXpath = new By.ByXPath(AddTeamPageObject.addNewTeamBtnXpath);
    private final By addTeamTextXpath = new By.ByXPath(AddTeamPageObject.addTeamTextXpath);
    private final By inputTeamNameXpath = new By.ByXPath(AddTeamPageObject.teamNameXpath);
    private final By inputPlayer1Xpath = new By.ByXPath(AddTeamPageObject.player1DropdownXpath);
    private final By inputPlayer2Xpath = new By.ByXPath(AddTeamPageObject.player2DropdownXpath);
    private final By addTeamBtn = new By.ByXPath(AddTeamPageObject.addTeamBtn);

    public void AddTeam (String teamName , String player1Name , String player2Name){
        driver.findElement(addNewTeamBtnXpath);
        driver.findElement(inputTeamNameXpath).sendKeys(teamName);
        driver.findElement(inputPlayer1Xpath).sendKeys(player1Name);
        driver.findElement(inputPlayer2Xpath).sendKeys(player2Name);
        driver.findElement(addTeamBtn).click();
    }



}
