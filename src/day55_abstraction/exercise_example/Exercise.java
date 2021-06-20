package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){//  non -abstract method
        System.out.println("Warming up and starting the exercise");

    }
    /**
    abstract method - method without body/impl, just signature
    purpose: letting sub classes implement/override their own way
     */
    public abstract void perform(); // method can;t be final and abstract at the same time.
                                     // final means not abstract
                                    // can't be private and abstract at the same time


    /**
     * another abstract method that concrere sub classes will override/implement
     * @param minutes - how long is exercise ir performed
     * @return number of calories burned/used

     */
    public abstract int getCaloriesCount(int minutes);

}
