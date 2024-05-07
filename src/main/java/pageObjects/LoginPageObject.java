package pageObjects;

public interface LoginPageObject {
    String inputEmailLink ="//android.widget.EditText[@text=\"Email\"]";
    String inputPasswordLink="//android.widget.EditText[@text=\"Password\"]";
    String loginBtnLink ="//android.view.ViewGroup[@content-desc=\"Login\"]";
    String forgotPasswordBtnLink="//android.widget.TextView[@text=\"Forgot password?\"]";
    String signUpBtnLink="//android.widget.TextView[@text=\"Sign up\"]";
    String addMatchTextLink ="//android.widget.TextView[@text=\"Add Match\"]";
    String addMatchText="Add Match";
    String errorMessageLink= "//android.widget.TextView[@resource-id=\"toastText2\"]";
    String errorMessage = "User Not Found";
    String blankErrorMessage = "Enter Your Credentials";
}
