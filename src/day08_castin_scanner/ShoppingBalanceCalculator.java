package day08_castin_scanner;
//balance -> 345.55;
// price1 -> 20.88
// price2 -> 89.99
// price3 -> 15
// remainingBalance -> calculate
// Your initial balance: $345.55
// Your remainingBalance: $28...
public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;

        double remainingBalance = balance - price1 - price2 - price3;
        //double remainingBalance = balance - (price1 + price2 + price3);
        //balance = remainingBalance;
        System.out.println(balance - price1 - price2 - price3);
        System.out.println(remainingBalance);
        System.out.println("Your initial balance: $" + balance);
        System.out.println("Your remaining balance: $" + remainingBalance);

//I want to print my remaining balance without change.
//219.68 -> 219
//balanceWithNoCents -> remainingBalance without cents
// Print: Your remaining balance without cents: $219;
        int balanceWithNoCents = (int) remainingBalance;
        System.out.println("Your remaining balance without cents : $" +balanceWithNoCents);





    }

}
