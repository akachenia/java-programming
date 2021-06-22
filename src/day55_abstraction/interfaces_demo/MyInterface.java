package day55_abstraction.interfaces_demo;

public interface MyInterface {
    public abstract void learn();


}

class MyClass implements MyInterface{
    @Override
    public void learn(){
        System.out.println("Learning in MyCLass");
    }

}

class Main {
    public static void main(String[] args) {
      //  MyInterface myInterface = new MyInterface(); ERROR: cannot create object of interface
        MyClass myClass = new MyClass();

    }
}