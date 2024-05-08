package tests;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pages.HomePage;
import pages.LoginPage;
import pages.WelcomePage;

public class HomePageTestCases {

    LoginPage loginPage =new LoginPage();
    WelcomePage welcomePage = new WelcomePage();
    HomePage homePage = new HomePage();
    private final By addMatchTextXpath =new By.ByXPath(LoginPageObject.addMatchTextLink);


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
    public void logout(String email, String password){
        try{
            welcomePage.SkipWelcome();
            loginPage.Login(email,password);
            String txt = BaseClass.driver.findElement(addMatchTextXpath).getText();
            Assert.assertEquals(txt, LoginPageObject.addMatchText);
            homePage.logout();
            Thread.sleep(3000);
        }
        catch (Exception e){}

    }
}
