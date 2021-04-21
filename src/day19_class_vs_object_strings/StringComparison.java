package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Bishkek";
        //equals() method - Case sensitive
        System.out.println(city.equals("Bishkek")); //true
        System.out.println(city.equals("bishkek")); //false
        System.out.println(city.equals("Bishkek ")); //false

        //EQUALSIGNORECASE() METHOD - CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("Bishkek")); //true
        System.out.println(city.equalsIgnoreCase("BISHKEK")); //TRUE
        System.out.println(city.equalsIgnoreCase("BishKek"));// true
        System.out.println(city.equalsIgnoreCase("Biishkek")); //false
        System.out.println(city.equalsIgnoreCase("Bish kek")); //false
        if(city.equals("BISHKEK")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("Bishkek")){
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
