package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {

        // System.out.println("Floor 1 selected", companies: Lobby, Verizon, Starbucks
        //when floorNum is 2 -> "Floor 2 selected. Companies: Cybertek, NASA, intelsat
        // floorNum is 3 -> "Floor 3 selected. Companies: Lyft, Bofa, stake house
        //anything else: print "Invalid floor - 6

        int floorNum = 1;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, Bofa, stake house");
        } else {
            System.out.println("Invalid floor");
        }


        System.out.println("*****SWITCH STATEMENT*****");
        floorNum = 2;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected: Lobby, Verizon, Starbucks");
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, Bofa, stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }

    }

    }






