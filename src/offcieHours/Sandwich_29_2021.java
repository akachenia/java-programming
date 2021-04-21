package offcieHours;

public class Sandwich_29_2021 {
    public static void main(String[] args) {

        String str = "breadjambread";

        if (str.contains("bread")) {

            int firstBread = str.indexOf("bread");

            if (str.substring(firstBread + 5).contains("bread")) { //jambread

                int secondBread = str.lastIndexOf("bread");

                String result = str.substring(firstBread +5, secondBread);

                if(result.isEmpty()){
                    System.out.println("nothing");
            }else{
                    System.out.println(result);
                }



            } else {
                System.out.println("nothing");
            }

            } else {
            System.out.println("nothing");
        }
    }
}
