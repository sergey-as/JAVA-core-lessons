package lesson2;

public class Worker extends Person{

    private int salary;

    public Worker(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    @Override
    public void method() {
        System.out.println("I'm worker");
    }
}
