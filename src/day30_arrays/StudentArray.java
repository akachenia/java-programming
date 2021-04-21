package day30_arrays;

import java.sql.SQLOutput;
import java.util.Locale;

public class StudentArray {
    public static void main(String[] args){
        //id - 0
        //firstName - 1
        //lastName - 2
        //batchNum - 3
        //phoneNum - 4

        String [] student1 = new String[5];
        student1[0] = "AD1234"; // longest way
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "999999999";

        String[] student2 = {"MK4422", "Mike", "Bloomberg", "B22", "70093939"};//shortest way

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        //check if student1 data array contains 5 items.
        //true; Pass: data array has correct length
        //false: FAIL: data array has o=incorrect length
        if (student1.length == 5) {
            System.out.println("PAss: data array has correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("pass: data arrays length match");
        } else {
            System.out.println("Fail: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase(Locale.ROOT) + " " +  student2[2].toUpperCase(Locale.ROOT));


    }


}
