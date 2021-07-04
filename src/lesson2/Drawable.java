package lesson2;

public interface Drawable {

    // in java 8:
    int A = 10; // const - public static final

    String draw(); // abstract method - public abstract

    default void defMethod(){ // default method
        System.out.println(draw());
        System.out.println("default method");
    }

}
