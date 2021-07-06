package InterviewPractising;

import java.util.ArrayList;
import java.util.Arrays;

public class removeMustafa {
    public static void main(String[] args) {

        ArrayList<String> AisList = new ArrayList<>();
        AisList.add("Aisalkyn");
        AisList.add("Aidana");
        AisList.add("Victor");
        AisList.add("Mustafa");
        AisList.add("Mustafa");
        AisList.add("Masha");

        System.out.println(removeGivenName(AisList, "Mustafa"));

//
//        for (int i = 0; i < myList.size(); i++) {
//            if (myList.get(i).equals("Mustafa")) {
//                myList.remove(i--);
//            }
//
//        }
//
//        System.out.println(myList);

    }


    public static ArrayList<String> removeGivenName(ArrayList<String> myList, String name) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).equals(name)) {
                myList.remove(name);
                i--;
            }

            }
       return myList;
        }





}







