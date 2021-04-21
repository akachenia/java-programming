package day34_void_methods;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("Starting etsy search smoke test");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---Etsy Search Smoke Test completed - Pass -");
    }
    public static void openBrowser(){
        System.out.println("launching browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("navigating to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: verify etsy home page is displayed");
        System.out.println("Type 'Wooden spoon in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Pass: Search results are successfully ");
    }
}
//openBrowser
//navigateToEtsyUrl
//searchForWoodenSpoon
//verifyResultsAreDisplayed