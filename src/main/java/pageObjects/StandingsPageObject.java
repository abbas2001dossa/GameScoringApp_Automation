package pageObjects;

public interface StandingsPageObject
{
    String teamStandingsTextXpath ="//android.widget.TextView[@text=\"Team Standings \"]";
    String teamStandingsText ="Team Standings ";
    String playerStandingsTextXpath = "//android.widget.TextView[@text=\"Player Standings \"]";
    String playerStandingsText = "Player Standings ";
    String playerTeamToggleBtnXpath = "//android.view.ViewGroup[@content-desc=\"Team, \uE606\"]";

}
