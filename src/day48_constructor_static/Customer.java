package day48_constructor_static;

public class Customer {
    private String name;
    private int id;

    // NO-Args Constructor
    public Customer() {
        System.out.println("No-args constructor");
        name = "new customer";
        id = -1;
    }

public Customer(String name, int id) {
            System.out.println("2args constructor");
            this.name = name;
            this.id = id;

}
    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//click on right generate and getter setter click shift and choose both
// the same with toString