package day47_constructors;

public class Student {
    public Student(){
        System.out.println("No-Args constructor");
    }

    //constructor with 1 param: String name

    public Student(String name){
        System.out.println("name param constructor | name = " + name);
    }

// constructor with age
    public Student(int age){
        System.out.println("age para, constructor | age = " + age);
    }

    //constructor with name and age
    public Student(String name, int age){
        System.out.println("name and age param constructor | " + name + "-" + age);

    }

}
