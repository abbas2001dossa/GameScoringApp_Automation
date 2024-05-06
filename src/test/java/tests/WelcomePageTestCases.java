package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WelcomePage;

public class WelcomePageTestCases {

    WelcomePage welcomePage ;

    @BeforeMethod
    public void setUp() {
        welcomePage = new WelcomePage();

        //welcomePage.resetAppToWelcomePage();  // A custom method to reset the app's state
    }



    @Test
    public void checkWelcomePageCarousel(){
        welcomePage.Carousel();
    }

    @Test
    public void checkWelcomePageSkip(){
        welcomePage.SkipWelcome();
    }
}
