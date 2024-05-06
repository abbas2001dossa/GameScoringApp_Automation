package utils;


import org.openqa.selenium.remote.CapabilityType;

public interface MobileCapabilityTypes extends CapabilityType {

    String APP_PACKAGE = "com.game_scoring_app";
    String APP_ACTIVITY ="com.game_scoring_app.MainActivity";
    String U_DID = "UG4DDATG8PAYHYDI";
    String U_DID_A11 = "R9JN41BLR9J";
    String PLATFORM_NAME="Android";
    String DEVICE_NAME ="Oppo A18 Device";
    Boolean APP_WAIT_FOR_LAUNCH = false ;
    String URL ="http://127.0.0.1:4723/wd/hub";
}
