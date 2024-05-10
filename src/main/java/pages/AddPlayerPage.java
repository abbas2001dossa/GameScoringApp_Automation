package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.AddPlayerPageObject;
import pageObjects.LoginPageObject;

import java.time.Duration;

public class AddPlayerPage extends BaseClass
{
    private final By addPlayerBtnXpath =new By.ByXPath(AddPlayerPageObject.addPlayerBtnXpath);
    private final By addPlayerTextXpath = new By.ByXPath(AddPlayerPageObject.addPlayerTextXpath);
    private final By playerNameXpath = new By.ByXPath(AddPlayerPageObject.playerNameXpath);
    private final By addBtnXPath = new By.ByXPath(AddPlayerPageObject.addBtnXpath);
    private final By deleteBtnXPath = new By.ByXPath(AddPlayerPageObject.deleteBtnXpath);
    private final By editBtnXpath = new By.ByXPath(AddPlayerPageObject.editBtnXpath);
    private final By yesConfirmationXpath = new By.ByXPath(AddPlayerPageObject.YesConfirmationMsgXpath);
    private final By noConfirmationXpath = new By.ByXPath(AddPlayerPageObject.NoConfirmationMsgXpath);
    private final By editConfirmXpath = new By.ByXPath(AddPlayerPageObject.editConfirmXpath);
    private final By elementXpath = new By.ByXPath(AddPlayerPageObject.element);
    private final By goBack = new By.ByXPath("//android.widget.TextView[@text=\"\uE61C\"]");

    public void addPlayer (String playerName){
        driver.findElement(addPlayerBtnXpath).click();
        String txt = driver.findElement(addPlayerTextXpath).getText();
        Assert.assertEquals(txt,AddPlayerPageObject.addPlayerText);

        //add player name
        driver.findElement(playerNameXpath).sendKeys(playerName);
        driver.findElement(addBtnXPath).click();

    }

    public void validatePlayerPresent(String playerName)
    {
        Assert.assertNotNull(driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\\\""+playerName+"\\\"]")));
    }

    public void validatePlayerNotPresent(String playerName){
        Assert.assertNull(driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\\\""+playerName+"\\\"]")));
    }

    // not working
    public void editPLayer (String existingPLayerName, String newPlayerName){
        driver.findElement(editBtnXpath).click();
        driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+existingPLayerName+"\"]")).sendKeys("\b");
        driver.findElement(new By.ByXPath("//android.widget.TextView[@text=\""+existingPLayerName+"\"]")).sendKeys(newPlayerName);
        driver.findElement(editConfirmXpath).click();
    }

    public void deletePlayer (String playerName) {
        driver.findElement(deleteBtnXPath).click();
        driver.findElement(yesConfirmationXpath).click();
    }

    public void goBack(){
        driver.findElement(goBack).click();
    }
}
