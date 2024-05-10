package pageObjects;

public interface AddTeamPageObject {
    String addNewTeamBtnXpath ="//android.view.ViewGroup[@content-desc=\"\uE627, Add New\"]";
    String addTeamTextXpath ="//android.widget.TextView[@text=\"Add Team\"]";
    String addTeamText = "Add Team";
    String teamNameXpath = "//android.widget.EditText[@text=\"Team name\"]";
    String player1DropdownXpath ="//android.widget.TextView[@text=\"Select player 1\"]";
    String player2DropdownXpath ="//android.widget.TextView[@text=\"Select player 2\"]";
    String addTeamBtn ="//android.view.ViewGroup[@content-desc=\"Add\"]";

    //to validate in the teams list
    // --     "//android.widget.TextView[@text=\"aplha\"]";
    //--      "//android.widget.TextView[@text="Saleem"]";

}
