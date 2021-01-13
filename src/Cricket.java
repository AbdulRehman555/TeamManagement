import java.text.NumberFormat;

public class Cricket extends Team{
    private int seriesWonPerYear;

    public Cricket(String Country, double yearlyIncome,int seriesWonPerYear) throws IllegalAccessException {
        super(Country, yearlyIncome);
        if(seriesWonPerYear<0 || seriesWonPerYear>100){
            //Exception Handling
            throw new IllegalAccessException("number must be between 0 and 100");
        }
        this.seriesWonPerYear = seriesWonPerYear;
    }

    @Override
    public String yearlyEarnings() {
        return (NumberFormat.getCurrencyInstance().format(super.yearlyIncome*seriesWonPerYear));

    }
}
