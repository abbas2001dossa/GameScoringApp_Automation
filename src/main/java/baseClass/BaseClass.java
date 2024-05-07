package baseClass;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import utils.AppiumDriver;

public class BaseClass {

    public static AndroidDriver driver ;



    public static void setUp() {
        driver = AppiumDriver.getAppiumDriver();
    }


    public static  void tearDown() {
        if (driver != null) {
            driver.quit(); // Ensure the session is properly closed
        }
    }
}
