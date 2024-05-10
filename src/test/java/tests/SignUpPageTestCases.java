package tests;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.SignUpPageObject;
import pages.LoginPage;
import pages.SignUpPage;
import pages.WelcomePage;

public class SignUpPageTestCases {

    WelcomePage welcomePage = new WelcomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signupPage = new SignUpPage();

    @BeforeMethod
    public void initialize() {
        BaseClass.setUp();
    }

    @AfterMethod
    public void cleanup(){
        BaseClass.tearDown();
    }

//    @Test
//    @Parameters({"email", "password"})
//    public void SignupWithValidCredentials(String email, String password){
//        try{
//            welcomePage.SkipWelcome();
//            loginPage.goToSignup();
//            signupPage.validateItsOnSignUpPage();
//            signupPage.signup(email,password);
//            Thread.sleep(4000);
//        }
//        catch (Exception e){}
//
//    }

    @Test
    @Parameters({"InEmail", "InPassword"})
    public void SignupWithInValidCredentials(String email, String password){
        try{
            welcomePage.SkipWelcome();
            loginPage.goToSignup();
            signupPage.validateItsOnSignUpPage();
            signupPage.signup(email,password);
            String txt = BaseClass.driver.findElement(new By.ByXPath(SignUpPageObject.errorMsgXpath)).getText();
            Assert.assertEquals(txt,SignUpPageObject.errorMsg);
            Thread.sleep(4000);
        }
        catch (Exception e){}

    }


}
