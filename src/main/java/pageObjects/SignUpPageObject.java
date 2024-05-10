package pageObjects;

public interface SignUpPageObject {
    String inputEmailLink ="//android.widget.EditText[@text=\"Email\"]";
    String inputPasswordLink="//android.widget.EditText[@text=\"Password\"]";
    String signUpBtnLink ="//android.view.ViewGroup[@content-desc=\"Sign up\"]";
    String loginUpBtnLink="//android.widget.TextView[@text=\"Log in\"]";
    String signupTextLink ="//android.widget.TextView[@text=\"Sign Up\"]";
    String signupText = "Sign Up";
    String errorMsgXpath="//android.widget.TextView[@resource-id=\"toastText2\"]";
    String errorMsg = "Invalid Email ";
}
