import java.util.*;
public class Jok {
    public static void main(String[]args) {
        ArrayList<String> myList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        boolean contiueYN = false;
        String name = "";

        myList.add("Bucks");
        myList.add("TimberWovles");
        myList.add("Lakers");
        myList.add("Heat");
        myList.add("Clippers");
        myList.add("OKC");
        myList.add("76");
        myList.add("Nuggets");

        Collections.shuffle(myList);

        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ". ");
            System.out.println(myList.get(i));

        }
         safeInput.prettyHeader("First Round!!");
        System.out.println();
        playGame(0,7,myList);
        playGame(1,6,myList);
        playGame(2,5,myList);
        playGame(3,4,myList);
        //seconds round
        safeInput.prettyHeader("Second Round!!");
        System.out.println();
        playGame(0,3,myList);
        playGame(1,2,myList);
        safeInput.prettyHeader("Champions!!!!");
        System.out.println();
        playGame(0,1,myList);

        System.out.println("the "+myList.get(0)+"are the Champions");

    }
    //first Round
    //1 plays 8






    public static void playGame(int teamA, int teamB, ArrayList<String> teams) {

        System.out.println(teams.get(teamA) + "vs" + teams.get(teamB));

        Random rnd = new Random();

        int teamAScore = rnd.nextInt(60) + 60;
        int teamBScore = rnd.nextInt(60) + 60;


        if (teamAScore > teamBScore) {

            System.out.println("the" + teams.get(teamA) + " defeats the " + teams.get(teamB));
            System.out.println("Final score"+teamAScore + "-" + teamBScore);
            System.out.println();
            teams.remove(teamB);
        } else if (teamBScore > teamAScore) {
            System.out.println("the" + teams.get(teamB) + " defeats the " + teams.get(teamA));
            System.out.println("Final score"+teamAScore + "-" + teamBScore);
            System.out.println();
            teams.remove(teamA);

        } else {
            System.out.println("going into overtime");
            do {
                int OTscoreA = rnd.nextInt(10);
                int OTscoreB = rnd.nextInt(10);

                teamAScore = teamAScore + OTscoreA;
                teamBScore = teamBScore + OTscoreB;
                if (teamAScore > teamBScore) {

                    System.out.println("Final score"+teamAScore + "-" + teamBScore);
                    System.out.println();
                    teams.remove(teamB);
                    break;
                }
                else if (teamBScore > teamAScore) {
                    System.out.println("Final score"+teamAScore + "-" + teamBScore);
                    System.out.println();
                    teams.remove(teamA);
                    break;
                }

            }while (true);
        }
    }
}
