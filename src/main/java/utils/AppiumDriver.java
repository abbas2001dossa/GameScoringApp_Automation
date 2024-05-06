package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriver {

    public static AndroidDriver getAppiumDriver(){

        AndroidDriver Driver =null ;

        try {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName(MobileCapabilityTypes.PLATFORM_NAME);
            options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
            options.setAppPackage(MobileCapabilityTypes.APP_PACKAGE);
            options.setDeviceName(MobileCapabilityTypes.DEVICE_NAME);
            options.setUdid(MobileCapabilityTypes.U_DID);
            options.setAppActivity(MobileCapabilityTypes.APP_ACTIVITY);
            options.setAppWaitForLaunch(MobileCapabilityTypes.APP_WAIT_FOR_LAUNCH);

            // setting url with server of appium
            Driver = new AndroidDriver(new URL(MobileCapabilityTypes.URL), options);

            // to make it sleep for 4 seconds
            Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // Driver.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return Driver;
    }


    public static AndroidDriver getAppiumDriverForA11(){

        AndroidDriver Driver =null ;

        try {

            // setting capabilities
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName(MobileCapabilityTypes.PLATFORM_NAME);
            options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
            options.setAppPackage(MobileCapabilityTypes.APP_PACKAGE);
            options.setDeviceName(MobileCapabilityTypes.DEVICE_NAME);
            options.setUdid(MobileCapabilityTypes.U_DID_A11);
            options.setAppActivity(MobileCapabilityTypes.APP_ACTIVITY);
            options.setAppWaitForLaunch(MobileCapabilityTypes.APP_WAIT_FOR_LAUNCH);

            // setting url with server of appium
            Driver = new AndroidDriver(new URL(MobileCapabilityTypes.URL), options);

            // to make it sleep for 4 seconds
            Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // Driver.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return Driver;
    }


}
