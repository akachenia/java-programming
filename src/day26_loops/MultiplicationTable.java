package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 15;
        for(int i =1; i<= 10; i++){
            System.out.println(number + "x" + i + " = " + (number * i));
        }
       // System.out.println(number +" x "+1 +" = "+(number*1));
   //     System.out.println(number +" x "+2 +" = "+(number*2));
     //   System.out.println(number +" x "+3 +" = "+(number*3));
       // System.out.println(number +" x "+4 +" = "+(number*4));
        //System.out.println(number +" x "+5 +" = "+(number*5));
        //System.out.println(number +" x "+6 +" = "+(number*6));

        if(number < 1 || number > 10){
            System.out.println("Error: invalid input");
            return;
        }
    }
}
