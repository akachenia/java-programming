package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Akachenya";
        employee.jobTitle = "QA";
        employee.work();

        Employee employee2 = new Employee();
        employee2.name = "Aidai";
        employee2.jobTitle = "Model";
        employee2.work();

    }
}
