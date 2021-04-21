package day37_methods_overloading;

public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi", 3, '|'));
        System.out.println(repeatString("Ican do it", 10, '-'));
    }
    public static String repeatString(String word, int times, char delimiter){
    String retValue = "";

    for(int i = 1; i <= times; i++){
      retValue += word + delimiter;

  }
        return retValue;

    }
}
