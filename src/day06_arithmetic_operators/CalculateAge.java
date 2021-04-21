package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args){
        int yearofBirth = 1984;
        int currentYear = 2021;
        int age = currentYear - yearofBirth;
        System.out.println("You are " + age + " years old");
    }
}
