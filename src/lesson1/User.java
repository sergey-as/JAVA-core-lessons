package lesson1;

import java.util.Arrays;

public class User {
//    byte
//    short
//    int
//    long

//    //1
//    int id = 1;
//    String name = "John";
//    String surname = "Doe";
//    // float
//    double weight = 85.324657987;
//    boolean status = true; // ==  !=  .equals
//    String[] skills = {"java", "js"};
//    String[] phrases = new String[10];

//    //2
//    int id;
//    String name;
//    String surname;
//    // float
//    double weight;
//    boolean status; // ==  !=  .equals
//    String[] skills;
//    String[] phrases;

    //3
    private int id;
    private String name;
    private String surname;
    // float
    private double weight;
    private boolean status; // ==  !=  .equals
    private String[] skills;
    private String[] phrases;

    public User() {
    }

    public User(int id, String name, String surname, double weight, boolean status, String[] skills, String[] phrases) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.status = status;
        this.skills = skills;
        this.phrases = phrases;
    }

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void greeting() {
        System.out.println("hello my name is " + this.name + " " + this.surname);
    }

    public String greeting(String msg) {
        return msg + "hello my name is " + this.name + " " + this.surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("ERROR");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getPhrases() {
        return phrases;
    }

    public void setPhrases(String[] phrases) {
        this.phrases = phrases;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", status=" + status +
                ", skills=" + Arrays.toString(skills) +
                ", phrases=" + Arrays.toString(phrases) +
                '}';
    }
}
