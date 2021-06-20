package day55_abstraction.exercis_example;

public class Swimming extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing swimming in a poll or ocean");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
