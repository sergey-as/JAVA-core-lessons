package lesson4;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;

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

    @Override
    public int compareTo(Person person) {
        final int idDif = this.getId() - person.getId();
        int nameDif = this.getName().compareTo(person.getName());
        int ageDif = this.getAge() - person.getAge();

        if (idDif != 0) {
            return idDif;
        } else if (nameDif != 0) {
            return nameDif;
        } else return ageDif;

    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(id, name, age);
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
