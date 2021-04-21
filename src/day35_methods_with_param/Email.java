package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
    buildEmail("akachenia", "gmail");
    buildEmail("John Ward III", "verizon");
    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" "," ").toLowerCase();
        domain = domain.toLowerCase();

        System.out.println("This is my email: " +name+ "@" + domain + ".com");
    }
}
