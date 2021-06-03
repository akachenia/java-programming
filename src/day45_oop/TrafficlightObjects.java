package day45_oop;

public class TrafficlightObjects {
    public static void main(String[] args) {
        // create traffic light object
        Trafficlights trafficlights = new Trafficlights();
      //  trafficlights.color = "red"; NOT THIS WAY today
        //we will assign/update the value of color using a method of the class
        trafficlights.changeColor("red");
        //System.out.println(trafficlights.color); Direct acces to variable. not recomended

        trafficlights.showColor();
        trafficlights.changeColor("green");

        Trafficlights trafficlights2 = new Trafficlights();
        trafficlights2.color = "black";
        trafficlights2.showColor();

    }
}
