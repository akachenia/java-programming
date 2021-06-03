package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object. just characters
        App uberApp = new App(); // creating new object
        //opening uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open();

        uberApp.version = 4.0;
        uberApp.open(); // open new version
    }



}
