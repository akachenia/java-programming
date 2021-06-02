package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message: " + message);
       // System.out.println("num = " + num); //ERROR: num is instance variable.static cannot aceept
        System.out.println("count = " + count); //no error. count is static variable

    }

    public static void anotherStaticMethods(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //StaticMEthods.instanceMEthod(); > no
    //Static Methods stm = new StaticMethods();
    //srm.instanceMethod();
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        System.out.println("hello from instance ");
    }
}
