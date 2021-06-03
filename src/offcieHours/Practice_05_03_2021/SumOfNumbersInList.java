package offcieHours.Practice_05_03_2021;

import Day41_arrayList.ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class SumOfNumbersInList {

    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>(Arrays.asList("123", "54", "24"));


        for(int i = 0; i < List.size(); i++){
            int totalSum = 0;

          for(char digit : List.get(i).toCharArray()){
              totalSum += Integer.parseInt("" +digit);
          }

            List.set(i, "" + totalSum);

          }

        System.out.println(List);

      }
    }

