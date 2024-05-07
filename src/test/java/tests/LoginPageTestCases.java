package tests;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pages.LoginPage;
import pages.WelcomePage;


public class LoginPageTestCases {

    LoginPage loginPage =new LoginPage();
    WelcomePage welcomePage = new WelcomePage();
    private final By addMatchTextXpath =new By.ByXPath(LoginPageObject.addMatchTextLink);
    private final By errorMessageXpath = new By.ByXPath(LoginPageObject.errorMessageLink);


    @BeforeMethod
    public void initialize() {
        BaseClass.setUp();
    }

    @AfterMethod
    public void cleanup(){
        BaseClass.tearDown();
    }


    @Test
    @Parameters({"email", "password"})
    public void loginWithValidCredentials(String email, String password){
        try{
            welcomePage.SkipWelcome();
            loginPage.Login(email,password);
            String txt = BaseClass.driver.findElement(addMatchTextXpath).getText();
            Assert.assertEquals(txt,LoginPageObject.addMatchText);

            Thread.sleep(3000);
        }
        catch (Exception e){}

    }


    @Test
    @Parameters({"invalidEmail", "invalidPassword"})
    public void loginWithInValidCredentials(String email, String password){
        try{
            welcomePage.SkipWelcome();
            loginPage.Login(email,password);
            String txt = BaseClass.driver.findElement(errorMessageXpath).getText();
            Assert.assertEquals(txt,LoginPageObject.errorMessage);

            Thread.sleep(3000);
        }
        catch (Exception e){}

    }


    @Test
    @Parameters({"blankEmail", "blankPassword"})
    public void loginWithBlankCredentials(String email, String password){
        try{
            welcomePage.SkipWelcome();
            loginPage.Login(email,password);
            String txt = BaseClass.driver.findElement(errorMessageXpath).getText();
            Assert.assertEquals(txt,LoginPageObject.blankErrorMessage);

            Thread.sleep(3000);
        }
        catch (Exception e){}

    }

}

