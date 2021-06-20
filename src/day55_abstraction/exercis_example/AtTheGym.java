package day55_abstraction.exercis_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("running 30 mins - calories = " + exercise.getCaloriesCount(30));

        exercise.start();
        exercise.perform();
        System.out.println("running 30 mins - calories = " + running.getCaloriesCount(30));

        exercise.start();
        exercise.perform();
        System.out.println("swimming 30 mins - calories = " + swimming.getCaloriesCount(30));


        exercise.start();
        exercise.perform();
        System.out.println("freeweight 30 mins - calories = " + freeWeight.getCaloriesCount(30));


    }
}
