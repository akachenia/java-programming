package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat("grass");
        animal.speak();

        Animal cheetahObj = new Animal();
        System.out.println(cheetahObj.type);
        cheetahObj.type = "cheetah"; //change value to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");


    }


    }

