package pageObjects;

public interface HomePageObject {
    String sideNavButtonLink ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView";
    String resetDataBtnLink="//android.widget.TextView[@text=\"Reset Data\"]";
    String logoutBtnLink="//android.widget.TextView[@text=\"Log Out\"]";
    String sidenavLink ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
    String addMatchBtnLink="//android.view.ViewGroup[@content-desc=\"Add Match\"]";
    String standingsBtnLink="//android.view.ViewGroup[@content-desc=\"Standings\"]";
    String playersBtnLink="//android.view.ViewGroup[@content-desc=\"Players\"]";
    String teamsBtnLink="//android.view.ViewGroup[@content-desc=\"Teams\"]";
    String yesBtnLink ="//android.view.ViewGroup[@content-desc=\"Yes\"]";
    String noBtnLink ="//android.view.ViewGroup[@content-desc=\"No\"]";
}
