package pageObjects;

public interface ForgotPasswordPageObject {
    String inputEmailLink ="//android.widget.EditText[@text=\"Email\"]";
    String inputPasswordLink="//android.widget.EditText[@text=\"Password\"]";
    String inputRePasswordLink="//android.widget.EditText[@text=\"Confirm password\"]";
    String submitBtnLink ="//android.view.ViewGroup[@content-desc=\"Submit\"]";
}
