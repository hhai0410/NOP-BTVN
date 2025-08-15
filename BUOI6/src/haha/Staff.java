package haha;

public class Staff extends Person {
    private double salary;

    public Staff(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Staff(double salary) {
        this.salary = salary;
    }
}
