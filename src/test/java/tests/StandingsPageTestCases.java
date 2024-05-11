package tests;

import baseClass.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.StandingsPage;

public class StandingsPageTestCases {

    HomePage homePage = new HomePage();
    StandingsPage standingsPage = new StandingsPage();
    @BeforeMethod
    public void initialize() {
        BaseClass.setUp();
    }

    @AfterMethod
    public void cleanup(){
        BaseClass.tearDown();
    }

    @Test
    @Parameters({"playerName","player2Name","player3Name","player4Name"})
    public void ViewStandings(String playerName, String player2Name , String player3Name , String player4Name){

        try{
            BaseClass.Login();
            homePage.openStandings();
            standingsPage.navigateToPlayerStandings();
            standingsPage.validatePlayersPresent(playerName,player2Name,player3Name,player4Name);
            standingsPage.goBack();
            standingsPage.goBack();
            Thread.sleep(3000);
        }
        catch (Exception e){}

    }
}
