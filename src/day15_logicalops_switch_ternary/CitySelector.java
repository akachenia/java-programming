package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        // city
        // "Moscow" "Osh"
        //-> "willing to relocate to Moscow"
        //.else
        //-> "not considering Seatle"
        String city = "OSH";
        if (city.equals ("Moscow") && city.equals ("OSH")){
            System.out.println("I am willing to relocate to Moscow");

        }else{
            System.out.println("Not considering - " + city);
        }

        String teacher = "Nadir";
        //Saim, Murodil -> it is a java class with Saim
        //otherwise -> Soft skill class with Nadir
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        }else {
            System.out.println("Soft skill class with " + teacher);
        }
            //1 - teacher Saim or Murodil -> it is a java class
            //2 - teacher Nadir -> soft akill class with
            // any other teacher -> some class with Gurkhan/Akbar
            if(teacher.equals("Saim") || teacher.equals("Murodil")) {
                System.out.println("java class with " + teacher);
            }else if (teacher.equals("Nadir")){
                System.out.println("Soft skill class with " + teacher);
            }else{
                System.out.println("Some other class with " + teacher);
            }

            String company = "Nadir Tech";
            double salary = 105_000.0;
            if(company.equals("Google") || salary>=100){
                System.out.println("accept offer " + company);
            }else{
                System.out.println("reject offer " + company);
            }
        }

    }
