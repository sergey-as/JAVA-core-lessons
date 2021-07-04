package lesson2;

public class Student extends Person {

    private int averagePoint;
    private String group;

    public Student(int id, String name, int age, int averagePoint, String group) {
        super(id, name, age);
//        this.id = id;
//        this.name = name;
//        this.age = age;
        this.averagePoint = averagePoint;
        this.group = group;
    }

    public int getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(int averagePoint) {
        this.averagePoint = averagePoint;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void method() {
        System.out.println("I'm student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "averagePoint=" + averagePoint +
                ", group='" + group + '\'' +
                "} " + super.toString();
    }
}
