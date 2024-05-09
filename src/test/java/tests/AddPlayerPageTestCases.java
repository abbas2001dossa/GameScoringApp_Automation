package tests;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pages.AddPlayerPage;
import pages.HomePage;

public class AddPlayerPageTestCases {

    AddPlayerPage addPlayerPage = new AddPlayerPage();
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void initialize() {
        BaseClass.setUp();
    }

    @AfterMethod
    public void cleanup(){
        BaseClass.tearDown();
    }

// add player works fine
//    @Test
//    @Parameters("playerName")
//    public void AddPLayer(String playerName){
//        try{
//            BaseClass.Login();
//            homePage.openPlayers();
//            addPlayerPage.addPlayer(playerName);
//            addPlayerPage.validatePlayerPresent(playerName);
//            Thread.sleep(3000);
//        }
//        catch (Exception e){}
//
//    }

//    @Test
//    @Parameters("playerNameDel")
//    public void DeletePLayer(String playerName){
//        try{
//            BaseClass.Login();
//            homePage.openPlayers();
//            addPlayerPage.deletePlayer(playerName);
//            addPlayerPage.validatePlayerNotPresent(playerName);
//            Thread.sleep(4000);
//        }
//        catch (Exception e){}
//
//    }

    @Test
    @Parameters({"existingPlayerName","playerName"})
    public void EditPLayer(String existingPlayerName,String playerName){
        try{
            BaseClass.Login();
            homePage.openPlayers();
            addPlayerPage.editPLayer(existingPlayerName,playerName);
            Thread.sleep(4000);
        }
        catch (Exception e){}

    }

}
