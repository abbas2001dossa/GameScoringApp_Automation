package baseClass;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import utils.AppiumDriver;

public class BaseClass {

    public AndroidDriver driver ;

    public BaseClass(){
        driver = AppiumDriver.getAppiumDriver();
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}
