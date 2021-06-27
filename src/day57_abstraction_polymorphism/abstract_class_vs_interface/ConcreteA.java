package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");

    }

    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void abdMethodD(int num) {
        System.out.println("abdMethodD overridden version is called - " + num);
    }
}

