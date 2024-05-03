import java.util.*;

public class wizardGame {
    public static void main(String[]args) {
            ArrayList<String> myList = new ArrayList<String>();
            Scanner in = new Scanner(System.in);


            boolean contiueYN = false;
            String name = "";
            //adding teams
            myList.add("Dwarves");
            myList.add("Wizards");
            myList.add("Dinosaurs");
            myList.add("Wigtown Wanderers");
            myList.add("Holyhead Harpies");
            myList.add("Appleby Arrows");
            myList.add("76");
            myList.add("Etc");
            //shuflling teams

            Collections.shuffle(myList);
            //mapping teams seeds

            for(int i = 0; i < myList.size(); i ++) {

                System.out.print(i + 1 + ". ");
                System.out.println(myList.get(i));

            }
            //showing first round
            safeInput.prettyHeader("First Round!!");
            System.out.println();
            // setting the first teams to play each other
            playGame(0,7,myList);
            playGame(1,6,myList);
            playGame(2,5,myList);
            playGame(3,4,myList);

            //seconds round
            safeInput.prettyHeader("Second Round!!");
            System.out.println();
            playGame(0,3,myList);
            playGame(1,2,myList);

            //Final round
            safeInput.prettyHeader("Champions!!!!");
            System.out.println();
            playGame(0,1,myList);

            //The winner
            System.out.println("the "+myList.get(0)+"are the Champions");


    }


    public static void playGame(int teamA, int teamB, ArrayList<String> teams) {



        Random rnd = new Random();

        int teamAScore = 0;
        int teamBScore = 0;
        int teamBTotal = 0;
        int teamATotal = 0;
        int goldenSnitch = 0;




        //Q1
        //points for both teams
        //Snitch
        safeInput.prettyHeader("The " + teams.get(teamA) + " vs " + teams.get(teamB) );
        //snitch for team a
        for (int i = 1; i < 5; i ++){
            goldenSnitch = rnd.nextInt(100);
            if(goldenSnitch < 6){
                System.out.println("games over, Golden snitch was caught by " + teams.get(teamA));
                teams.remove(teamB);
                return;
            }
            //snitch for team b
            else if (goldenSnitch > 94){
                System.out.println("games over, Golden snitch was caught by " + teams.get(teamB));
                teams.remove(teamA);
                return;
            }
            //genrate teams points
            System.out.println();
            teamAScore = rnd.nextInt(5)*10;
            teamBScore = rnd.nextInt(5)*10;
            //displaying the score for each team
            System.out.printf("\t Qtr" + i +": " +teamAScore+ "  " + teamBScore);
            System.out.println();
            teamATotal = teamATotal +teamAScore;
            teamBTotal = teamBTotal +teamBScore;



        }
        //deciding how wins
        if (teamATotal > teamBTotal) {

            System.out.println("the " + teams.get(teamA) + " defeats the " + teams.get(teamB));
            System.out.println("Final score "+teamATotal + "-" + teamBTotal);
            System.out.println();
            teams.remove(teamB);
        } else if (teamBTotal > teamATotal) {
            System.out.println("the " + teams.get(teamB) + " defeats the " + teams.get(teamA));
            System.out.println("Final score "+teamATotal + " - " + teamBTotal);
            System.out.println();
            teams.remove(teamA);
        //if the points are tided then go into overtime
        } else {
            System.out.println("going into overtime");
            do {
                int OTscoreA = rnd.nextInt(10);
                int OTscoreB = rnd.nextInt(10);

                teamATotal = teamATotal + OTscoreA;
                teamBTotal = teamBTotal + OTscoreB;
                if (teamATotal > teamBTotal) {

                    System.out.println("Final score "+teamATotal + "-" + teamBTotal);
                    System.out.println();
                    teams.remove(teamB);
                    break;
                }
                else if (teamBTotal > teamATotal) {
                    System.out.println("Final score "+teamATotal + "-" + teamBTotal);
                    System.out.println();
                    teams.remove(teamA);
                    break;
                }

            }while (true);
        }
    }

}
