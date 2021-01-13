import java.util.ArrayList;

public abstract class Team {
    //Fields
    private String country;
    protected double yearlyIncome;
    private ArrayList<String> playerNames;
    //Constructor
    public Team(String Country,double yearlyIncome){

        this.country = Country;
        this.yearlyIncome = yearlyIncome;
    }

    //Methods
    public abstract String yearlyEarnings();
    //setter
    //using ArrayList for names of players
    public void setPlayerNames(ArrayList<String> playerNames) {
        this.playerNames = playerNames;
    }
    //getter
    public ArrayList<String> getPlayerNames() {
        return playerNames;
    }
}
