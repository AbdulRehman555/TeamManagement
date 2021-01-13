public class TeamManagement {
    public static void main(String args[]) throws IllegalAccessException {

        //SubClass objects
        Cricket cricket = new Cricket("Pakistan",1_000_000,6);
        Football football = new Football("German",12_000_000,12);

        //Processed individualy
        System.out.println("Cricket Team: " + cricket.yearlyEarnings());
        System.out.println("Football Team: " + football.yearlyEarnings());

        // create two-element Team array
        // we may use more teams such as hockey,badminton etc.
        Team[] teams = new Team[2];

        // initialize array with teams
        teams[0] = cricket;
        teams[1] = football;

        // generically process each element in array teams
        for(Team currentTeam:teams){
            //System.out.println(currentTeam);
            System.out.println(currentTeam.yearlyEarnings());
        }

        // get type name of each object in teams array
         for(int i =0 ;i<teams.length;i++){
             System.out.printf("Team %d is a %s%n", i,
                     teams[i].getClass().getName());
         }
    }
}
