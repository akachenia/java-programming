package day09_scanner_practice;
//speedlimit -> 55
//currentSpeed -> 75
// overTheLimit -> currentSpeed - speedlimit;
// You are driving 20mph over the limit. Slow down!

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving 20 mph " + overTheLimit + "Slow down!");

    }
}
