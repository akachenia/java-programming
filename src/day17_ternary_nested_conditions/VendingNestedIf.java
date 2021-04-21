package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
      //  selection = "drink"
        //drink = "tea", "coke"
        //snack = "chips" , "candy"
        //when selection is "drink"
        //when drink is "tea"
        //"tea is selected"
        //when drink is "coke"
        //"coke is selected"
        //when selection is "Snack"
        //"snack option is selected"
        //"chips item is selected"
        //when snack is "candy"
        //"candy item is selected"
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "chips";
        if(selection.equals("drink")){
            System.out.println("drink option is Selected");
            if(drinkItem.equals("tea")){
                System.out.println("tea item is selected");
            }else{
                System.out.println("coke item is selected");
            }
        }else if(selection.equals("snack")){
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")){
                System.out.println("chips option is selected");
            }else{
                System.out.println("candy option is selected");
            }
        }
    }
}
