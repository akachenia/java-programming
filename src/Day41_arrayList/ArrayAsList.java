package Day41_arrayList;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        // nums.add(100); doesn't work
        // nums.remove(0); doesn't work
        //nums.clear(); UnsupportedOperationException
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);

        /*
        list String drinksWithCoffeine ->coffee, tea, monster, red bull, cake, pepsi, mdew, kambucha
        int coffeineAmount = 0;
        String drink = "monster"
        monster, red bull, celsius;
        coffeineAmount = 150
        coffe, kambucha:
        coffeineAmount = 112
        tea, coke, pepsi, mdew
         */

        List<String> drinkWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "cake", "pepsi", "mdew", "kambucha"));
        System.out.println(drinkWithCaffeine);


        int caffeineAmount = 0;
        for (String drink : drinkWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + "--> " + caffeineAmount);
                }else if(drink.equals("tea") || drink.equals("coke")|| drink.equals("pepsi")){
                caffeineAmount = 35;
                System.out.println(drink + "--->" + caffeineAmount);
            }

            }
        for(String each : drinkWithCaffeine){
            switch(each){
                case "mDew" : case "red bull" : case "pepsi" :
                    caffeineAmount = 150;
                    System.out.println(each+ "-->" +caffeineAmount);
                    break;
                case "coffee": case "tea": case "cambucha":
                    caffeineAmount=112;
                    System.out.println(each+" ==> "+caffeineAmount);
            }
        }

       drinkWithCaffeine.forEach(drink -> System.out.println(drink));
        drinkWithCaffeine.forEach(drink -> {
            System.out.println("this is forEach block");
            System.out.println("drink = " + drink);
        });

        }
        }

