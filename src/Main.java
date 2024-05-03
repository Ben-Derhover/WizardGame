import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        myList.add("polar bear");
        myList.add("jitaliang");
        myList.add("fugaliatong");
        myList.add("zingalang");
        myList.add("Josh past 12am");
        myList.add("2012 Honda civic");
        myList.add("Supra");
        myList.add("Pig");
        myList.add("Wiggla");
        myList.add("2006 ford festa");


        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ".");
            System.out.println(myList.get(i));

        }
        System.out.println("give me a item to remove");
        int myItem = 0;

        myItem= in.nextInt();

        myItem --;

        myList.remove(myItem);
        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ".");
            System.out.println(myList.get(i));

        }
        System.out.println("what item do you want to replace");
        String myString = "";

        myString = in.next();

        myList.set(5, myString);
        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ".");
            System.out.println(myList.get(i));

        }


    }
}