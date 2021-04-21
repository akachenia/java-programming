package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        //Are you sure you want to delete this file?
        //char selection = 'y';
        //answer -> boolean variable
        //selection -- "y";
        //true:
        //"your file will be deleted"
        //answer -> true
        //false :
        //"file deletion canceled"
        //answer -> false
        //"did file get deleted? - true"
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer;
        if (selection == 'y'){
            System.out.println("your file will be deleted");
            answer = true;
        }else {
            System.out.println("file deletion canceled");
            answer = false;
        }
        System.out.println("did file get deleted? - " + answer);

        }

    }

