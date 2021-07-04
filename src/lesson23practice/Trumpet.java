package lesson23practice;

public class Trumpet implements MusicalInstrument {
    private double diameter;

    public Trumpet() {
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("The trumpet is playing (%s diameter)%n", this.getDiameter());

    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
