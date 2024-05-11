package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.StandingsPageObject;

public class StandingsPage extends BaseClass
{
    private final By teamStandingsTextXpath =new By.ByXPath(StandingsPageObject.teamStandingsTextXpath);
    private final By playerStandingsTextXpath = new By.ByXPath(StandingsPageObject.playerStandingsTextXpath);
    private final By toggleButtonXpath = new By.ByXPath(StandingsPageObject.playerTeamToggleBtnXpath);

    public void navigateToPlayerStandings(){
        driver.findElement(toggleButtonXpath).click();
        String txt= driver.findElement(playerStandingsTextXpath).getText();
        Assert.assertEquals(txt,StandingsPageObject.playerStandingsText);
    }

    public void goBack (){
        driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\"\uE61C\"]")).click();
    }

    public void validatePlayersPresent(String playerName,String player2Name,String player3Name,String player4Name){
        String player1txt = driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+playerName+"\"]")).getText();
        String player2txt = driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+player2Name+"\"]")).getText();
        String player3txt = driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+player3Name+"\"]")).getText();
        String player4txt = driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+player4Name+"\"]")).getText();

        Assert.assertEquals(player1txt,playerName);
        Assert.assertEquals(player2txt,player2Name);
        Assert.assertEquals(player3txt,player3Name);
        Assert.assertEquals(player4txt,player4Name);

    }

}
