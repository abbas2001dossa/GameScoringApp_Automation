package pages;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import pageObjects.LoginPageObject;
import pageObjects.WelcomePageObject;

public class LoginPage extends BaseClass
{

    private final By inputEmailXpath =new By.ByXPath(LoginPageObject.inputEmailLink);
    private final By inputPasswordXpath = new By.ByXPath(LoginPageObject.inputPasswordLink);
    private final By loginBtnLink = new By.ByXPath(LoginPageObject.loginBtnLink);
    private final By forgotPassBtnLink = new By.ByXPath(LoginPageObject.forgotPasswordBtnLink);
    private final By signUpBtnLink = new By.ByXPath(LoginPageObject.signUpBtnLink);


    public void Login (String email , String password )
    {
        driver.findElement(inputEmailXpath).sendKeys(email);
        driver.findElement(inputPasswordXpath).sendKeys(password);
        driver.findElement(loginBtnLink).click();
    }

    public void goToSignup (){
        driver.findElement(signUpBtnLink).click();
    }


}
