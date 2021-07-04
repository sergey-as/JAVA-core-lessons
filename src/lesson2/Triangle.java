package lesson2;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateSquare() {
        return a*b*c/(a+b);//наприклад :)
    }

    @Override
    public String draw() {
//        System.out.println("Triangle becomes red");
        return "Triangle becomes red";
    }

    @Override
    public void defMethod() {
        System.out.println("default method Override in Triangle");
    }
}
