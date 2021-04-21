package day18_conditions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args){
       int score = 100;
        if(score>=1 && score<=40){
            System.out.println("is D");

        }else if(score>=41 && score<=60){
            System.out.println("is B");
        }else if(score >=61 && score<= 90){
            System.out.println("is C");
        } else if(score >=91 && score <= 100){
            System.out.println("is A");
        }else{
            System.out.println("invalid");
        }

    }
}
