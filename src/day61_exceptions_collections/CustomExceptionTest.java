package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 30;
        System.out.println("Class is going on for " + minutes + "minutes");
        if (minutes > 50) {
            throw new BreakTimeException("It is break time!");

        }
        System.out.println("lets continue the class");

        double balance = 400;
        double itemPrice = 500.0;
        System.out.println("i have $" + balance +" and purchasing item for $" + itemPrice);

        if (itemPrice > balance){
            throw new InsufficientBalanceException("Transaction declined. Not enough funds:(");
        }

        System.out.println("Item successfully purchase");

    }
}