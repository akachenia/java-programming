package SaimClass;
//) Create a class House
//    create a main method
//
//    - Each the datatype you feel is most appropriate for each variable.
//
//    - Create the following variables:
//        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
//
//    - Print each variable with a message with the value
//        Ex: The number of bedrooms is: 4
//            The number of bathrooms is: 3
public class House {
    public static void main(String[] args) {
        String houseType = "Single House";
        int numbersOfBedroom = 4;
        int numbersOfBathrooms = 4;
        byte numberOfKitchens = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = false;
        boolean isThereAPool = true;
        boolean isTheHouseForSale = true;
        int costOfTheHouse = 400000;
        String address = "Address";
        int zipCode = 22192;
        boolean isParkNearBy = true;
        String ratingOfSurroundingSchoolDistricts = "5 out of 5";

        System.out.println(houseType);
        System.out.println("Numbers of Besdrooms: " +  numbersOfBedroom);
        System.out.println("Numbers of Bathroom: " + numbersOfBathrooms );
        System.out.println("Number of Kitchen: " + numberOfKitchens);
        System.out.println("Is there a basement ? " + isThereABasement);
        System.out.println("Is there an attic ? " + isThereAnAttic);
        System.out.println("Is there a Pool ?" + isThereAPool);
        System.out.println("Is the house for sale ? " + isTheHouseForSale);






    }
}
