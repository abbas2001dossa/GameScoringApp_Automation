package tests;

import baseClass.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AddMatchScreen;
import pages.AddPlayerPage;
import pages.AddTeamPage;
import pages.HomePage;

import static utils.ScreenShot.capture;

public class AddMatchPageTestCases
{
    AddMatchScreen addMatch = new AddMatchScreen();
    HomePage homePage = new HomePage();
    AddTeamPage addTeam = new AddTeamPage();

    @BeforeMethod
    public void initialize() {
        BaseClass.setUp();
    }

    @AfterMethod
    public void cleanup(){
        BaseClass.tearDown();
    }

    @Test
    @Parameters({"team1Name","team2Name"})
    public void AddTeamMatch(String team1Name , String team2Name) {
        try {
            BaseClass.test = BaseClass.report.startTest("Add a team match ");
            BaseClass.Login();
            homePage.openAddMatch();
            Thread.sleep(1000);
            BaseClass.test.log(LogStatus.PASS,BaseClass.test.addScreenCapture(capture(BaseClass.driver))+ "Add Match Opened");

            addMatch.NavigateToAddTeamFromTeamMatch();
            Thread.sleep(1000);
            BaseClass.test.log(LogStatus.PASS,BaseClass.test.addScreenCapture(capture(BaseClass.driver))+ "Navigated To Add Team Successfully");


            //would be extended more

            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }

//    @Test
//    @Parameters()
//    public void AddIndividualMatch() {
//        try {
//            BaseClass.Login();
//            homePage.openPlayers();
//
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
//    }


}
