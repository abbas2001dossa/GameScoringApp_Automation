package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.SignUpPageObject;
import pageObjects.WelcomePageObject;

public class SignUpPage extends BaseClass
{
    private final By emailXpath =new By.ByXPath(SignUpPageObject.inputEmailLink);
    private final By passwordXpath = new By.ByXPath(SignUpPageObject.inputPasswordLink);
    private final By submtiBtnXpath = new By.ByXPath(SignUpPageObject.signUpBtnLink);
    private final By loginBtnXpath = new By.ByXPath(SignUpPageObject.loginUpBtnLink);
    private final By signupTextXpath = new By.ByXPath(SignUpPageObject.signupTextLink);

    public void signup (String email, String password){
        driver.findElement(emailXpath).sendKeys(email);
        driver.findElement(passwordXpath).sendKeys(password);
        driver.findElement(submtiBtnXpath).click();
    }

    public void goBackToLogin () {
        driver.findElement(loginBtnXpath).click();
    }

    public void validateItsOnSignUpPage(){
        String txt = driver.findElement(signupTextXpath).getText();
        Assert.assertEquals(txt,SignUpPageObject.signupText);
    }
}
