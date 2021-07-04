package lesson2;

public class Circle extends GeometricFigure{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double calculateSquare() {
        return Math.PI*r*r;
    }

    @Override
    public String draw() {
//        System.out.println("Circle becomes blue");
        return "Circle becomes blue";
    }
}
