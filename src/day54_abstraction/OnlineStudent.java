package day54_abstraction;
/*
OnlineStudent class will EXTEND student abstract class
 */
public class OnlineStudent extends Student {

    @Override
    public void attendClass(){
        System.out.println("Online student is attending the class using Zoom");
    }


}
