import java.util.*;


public class fucklatogan {

    public static void main(String[] args){

        ArrayList<String> myList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        boolean contiueYN = false;
        String name = "";

        do{
            name = safeInput.getNonZeroLenString(in, "give me a name to add");
            myList.add(name);
            contiueYN = safeInput.getYNConfirm(in, "you want to exit");

            System.out.println();




        }while(!contiueYN);

        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ".");
            System.out.println(myList.get(i));

        }
        for(int i = 0; i < myList.size(); i ++) {
            name =myList.get(i);

            if(name.length()>6){
                myList.remove(i);
            }


        }
        System.out.println(" Printing reduced list ");
        for(int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ".");
            System.out.println(myList.get(i));

        }





    }



}
