package practice_replit;

import java.util.Locale;

public class jamesBons {
    public static void main(String[] args) {
        String name = "james bond";
        String first = name.toUpperCase().charAt(0) + "";
        String last = name.toUpperCase().charAt(name.indexOf(" ") +1) + "";
        System.out.println(first + last);
    }
}
