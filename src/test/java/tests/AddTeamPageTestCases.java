package tests;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pages.AddPlayerPage;
import pages.AddTeamPage;
import pages.HomePage;
import pages.WelcomePage;

public class AddTeamPageTestCases {
    HomePage homePage = new HomePage();
    AddTeamPage addTeamPage = new AddTeamPage();
    AddPlayerPage playerPage = new AddPlayerPage();

    @BeforeMethod
    public void initialize() {
        BaseClass.setUp();
    }

    @AfterMethod
    public void cleanup(){
        BaseClass.tearDown();
    }

    @Test
    @Parameters({"teamName", "player1Name","player2Name"})
    public void addTeam(String teamName, String player1Name,String player2Name){
        try{
            BaseClass.Login();
            homePage.openPlayers();
            playerPage.addPlayer(player1Name);
            playerPage.addPlayer(player2Name);
            playerPage.goBack();
//            homePage.openTeams();
//            addTeamPage.AddTeam(teamName,player1Name,player2Name);
            Thread.sleep(3000);
        }
        catch (Exception e){}

    }
}
