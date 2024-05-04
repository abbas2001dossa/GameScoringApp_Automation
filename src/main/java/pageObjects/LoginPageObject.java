package pageObjects;

public interface LoginPageObject {
    String inputEmailLink ="//android.widget.EditText[@text=\"Email\"]";
    String inputPasswordLink="//android.widget.EditText[@text=\"Password\"]";
    String loginBtnLink ="//android.view.ViewGroup[@content-desc=\"Login\"]";
    String forgotPasswordBtnLink="//android.widget.TextView[@text=\"Forgot password?\"]";
    String signUpBtnLink="//android.widget.TextView[@text=\"Sign up\"]";
}
