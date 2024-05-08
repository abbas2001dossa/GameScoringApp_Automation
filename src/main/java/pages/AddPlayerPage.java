package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
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

    public void editPLayer (String newPlayerName){

    }

    public void deletePlayer (String playerName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // 10-second timeout

        WebElement targetElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//android.widget.EditText[@text='" + playerName + "']")
                )
        );

        // Navigate to the parent container
        WebElement parentContainer = targetElement.findElement(By.xpath("./..")); // Go up one level

        // Locate the delete button as a sibling within the same container
        WebElement deleteButton = parentContainer.findElement(
                By.xpath("./following-sibling::android.view.ViewGroup/android.widget.ImageView") // Navigate to sibling
        );
        System.out.println("Delete button found: " + deleteButton != null); // Debug print

        deleteButton.click();
        driver.findElement(yesConfirmationXpath).click();
    }
}
