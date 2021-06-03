package Day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesle");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2,"yugo");

        // firs car is jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString()); // print all cars
        String allCarsInList = myCars.toString();// saves all cars in 1 string variable

        System.out.println("allCarsInList = " + allCarsInList);

        //change index 0 to Lamborghini -> we use set methods
        myCars.set(0,"Lamborghini");
        System.out.println("after set = " + myCars.toString());

        //change index 4 to Honda

        myCars.set(4, "Honda");
        System.out.println("after set = " + myCars.toString()); // internally uses
/**
 * How would you do that if myCars was array:
 * myCars[] = "Honda";
 */
        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jigukli

        myCars.set(6, "jiguli");
        System.out.println(myCars);

        //replace ford with traban

       myCars.set(5, "traband");
        System.out.println(myCars);

        //lada -> bugatti
        /*
        if my cars contains "lada"
        find index of lada and set value to bugatti
        else
        print "lada is not found"
         */
        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else{
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti = " + myCars.toString());

        /*
        lamborgini - priius
        lada- lexus
        trabant -> audi
         */
        for(int i = 0; i < myCars.size(); i++){
            if (myCars.get(i).equals("Lamborghini")){
               myCars.set(i,"prius");

            }else if(myCars.get(i).equals("toyota")){
                myCars.set(i, "lexus");
        }else if (myCars.get(i).equals("traband")){
                myCars.set(i, "audi");
            }
        }
        System.out.println("after loop = " + myCars);

        }    }

