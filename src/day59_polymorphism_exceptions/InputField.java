package day59_polymorphism_exceptions;

public class InputField implements WebElement{
    public static final String TAG_NAME = "input";

    public void getValue(){
        System.out.println("Getting value in the InputField");

    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field - " + txt);
    }

    @Override
    public void click() {
        System.out.println("Click");

    }

    @Override
    public String getText() {
        System.out.println("getting text of input field");
        return null;
    }
}
