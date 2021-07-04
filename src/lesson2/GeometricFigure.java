package lesson2;

public abstract class GeometricFigure implements Drawable {

    private int perimetr;
    private int square;

    public int getPerimetr() {
        return perimetr;
    }

    public int getSquare() {
        return square;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateSquare();
}
