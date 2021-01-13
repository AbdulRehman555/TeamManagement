import java.text.NumberFormat;

public class Football extends Team {
    private int matchesWon;

    public Football(String Country, double yearlyIncome,int matchesWon) throws IllegalAccessException {
        super(Country, yearlyIncome);
        if(matchesWon<0 || matchesWon>365){
            //Exception handling
            throw new IllegalAccessException("number must be between 0 and 365");
        }
        this.matchesWon = matchesWon;
    }

    @Override
    public String yearlyEarnings() {
        return (NumberFormat.getCurrencyInstance().format(super.yearlyIncome*matchesWon));
    }
}
