package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        // grade = A,B,C,D,E
        //when grade is A or B, C
        //passed with grade
        //when grade is D
        //qualify for retake
        //when grade is E
        //fail
        //anything else
        //invalid grade
        char grade = 'A';
        if(grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade=='c'){
            System.out.println("passed with grade - " + grade);
        }else if (grade =='D' || grade =='d'){
            System.out.println("qualify for retake. Grade - " + grade);
        }else if(grade == 'E'){
            System.out.println("fail. Grade - " + grade);
        }else{
            System.out.println("invalid grade - " + grade);
        }

        }
    }

