package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        PrintAtoZ();
        for(int i = 0; i < 10; i++){
            PrintAtoZ();
        }
        displayUSFLag();
    }

    public static void PrintAtoZ(){
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i +" ");
        }
        System.out.println();

    }
    public static void displayUSFLag(){
        System.out.println("---------FLag of USA-------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
