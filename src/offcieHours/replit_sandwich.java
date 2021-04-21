package offcieHours;

public class replit_sandwich {
    public static void main(String[] args) {
        String str = "Javascript is a fun language";
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);

        System.out.println(str.substring(space+1) + " " + firstWord);
    }
}
