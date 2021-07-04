package lesson2;

public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return a + a + b + b;
    }

    @Override
    public double calculateSquare() {
        return a * b;
    }

    @Override
    public String draw() {
//        System.out.println("Rectangle becomes green");
        return "Rectangle becomes green";
    }
}
