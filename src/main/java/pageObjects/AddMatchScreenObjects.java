package pageObjects;

public interface AddMatchScreenObjects
{
    String addNewMatchBtnXpath ="//android.view.ViewGroup[@content-desc=\"\uE627, Add New\"]";
    String toggleButtonTeamXpath ="//android.view.ViewGroup[@content-desc=\"Team\"]";
    String toggleButtonIndXpath ="//android.widget.TextView[@text=\"Individual\"]";
    String goBackXpath = "//android.widget.TextView[@text=\"\uE61C\"]";

    String AddTeamMatchToggleXpath ="//android.view.ViewGroup[@content-desc=\"Team\"]";
    String AddIndMatchToggleXpath = "//android.view.ViewGroup[@content-desc=\"Individual\"]";

    //Add Match Team
    String teamTextXpath ="//android.widget.TextView[@text=\"Team\"]";
    String teamText="Team";
    String addNewTeamXpath ="//android.view.ViewGroup[@content-desc=\"\uF103, Add New\"]";
    String team1DropDownXpath = "//android.view.ViewGroup[@content-desc=\"Select Team 1\"]";
    String team2DropdownXpath = "//android.widget.TextView[@text=\"Select Team 2\"]";
    String submitBtnTeamXpath = "//android.view.ViewGroup[@content-desc=\"Submit\"]";
    String goBackFromTeamMatchXpath ="//android.widget.TextView[@text=\"\uE61C\"]";


    // Add Individual Match
    String individualTextXpath = "//android.widget.TextView[@text=\"Individual\"]";
    String individualText = "Individual";
    String player1DropDownXpath ="//android.widget.TextView[@text=\"Select Player 1\"]";
    String player2DropDownXpath = "//android.widget.TextView[@text=\"Select Player 2\"]";
    String submitBtnIndividualXpath = "//android.view.ViewGroup[@content-desc=\"Submit\"]";
    String goBackFromIndividualMatchXpath ="//android.widget.TextView[@text=\"\uE61C\"]";



}

