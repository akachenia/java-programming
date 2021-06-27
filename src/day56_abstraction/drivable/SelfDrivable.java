package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark(); thus causes error in sub classes, because they must override abstract method
    public default void selfPark(){ // if we add default method,
        System.out.println("performing self park steps");
    }

}
