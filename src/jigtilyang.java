import java.util.*;

public class jigtilyang {

    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        boolean contiueYN = false;
        double input = 0;
        double total = 0;
        double avg = 0;

        do{
            input = safeInput.getRangedDouble(in, "input numbers", 0, 100);
            myList.add(input);
            contiueYN = safeInput.getYNConfirm(in, "you want to exit");
        }while(!contiueYN);




        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ".");
            System.out.println(myList.get(i));

        }
        for(int i = 0; i < myList.size(); i ++) {
            total+=myList.get(i);
        }
        avg= total/ myList.size();
        System.out.println(avg);












    }








}
