package lesson2;

public class Person {
    private int id;
    private String name;
    private int age;
    static int a;
    public static final int CAPITAL_LETTER = 10;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void method(){
        System.out.println("I'm person");
    }

    public void method(String s){
        System.out.println(s+" - I'm person");
    }

    public void method(int s){
        System.out.println(s+" - I'm person");
    }

    public void method(int s, String ss){
        System.out.println(s+" - I'm person");
    }

    public static void methodStatic(){
        System.out.println("methodStatic");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
