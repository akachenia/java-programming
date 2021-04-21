package offcieHours;

public class Practice_03_02_2021 {
    public static void main(String[] args){
        //Variables without any data
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignmnet of date
         name = "Aisalkyn";
         age = 37;
         gender = 'F';
         student = true;
         numberOfSiblings = 5;
         favoriteNumber = 7;
         numberOfSeasons =4;
         birthDate = 3.2;
         year = 2021;
         fullBirthDate = "" + birthDate + "." + year; // 3.2.2021
        // fullBirthDate = birthDate + year + "";// 2025.2 ->adds first then turns to String
         favoriteQuote = "have a good mindset";

         System.out.println(name +"\n"+age + "\n"+gender + "\n"+student +"\n"+numberOfSiblings + "\n"+favoriteNumber +"\n" + numberOfSeasons + "\n" +birthDate +"\n" + year);
         System.out.println("Name:" + name);
         System.out.println("Age: "+ age);
         System.out.println("Full birthdate: " + fullBirthDate);




    }
}
