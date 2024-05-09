package pageObjects;

public interface AddPlayerPageObject
{
    String addPlayerBtnXpath ="//android.view.ViewGroup[@content-desc=\"\uE627, Add New\"]";
    String addPlayerTextXpath ="//android.widget.TextView[@text=\"Add Player\"]";
    String addPlayerText="Add Player";
    String playerNameXpath ="//android.widget.EditText[@text=\"Player Name\"]";
    String addBtnXpath ="//android.view.ViewGroup[@content-desc=\"Add\"]";
    //String playerCreatedXpath ="//android.widget.TextView[@text=\"Cv\"]";  //custom xpath for that player name thats created so it can be validated
    String deleteBtnXpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView";
    String editBtnXpath = "//android.widget.TextView[@text=\"\uDB80\uDFEB\"]";
    String YesConfirmationMsgXpath = "//android.view.ViewGroup[@content-desc=\"Yes\"]";
    String NoConfirmationMsgXpath = "//android.view.ViewGroup[@content-desc=\"No\"]";
    //String editNameInputXpath = "//android.widget.EditText[@text=\"Cv\"]"; // custom again - depends on name of player
    String editConfirmXpath = "//android.widget.TextView[@text=\"\uE630\"]";
    String element = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
    //conatins name eit del buttons
}
