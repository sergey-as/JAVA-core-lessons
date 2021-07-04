package lesson3;

import java.util.Random;

public class Engine {

    private double volume;
    private int power;
    private Car[] cars;

    public Engine(double volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean startEngine() {
        Random r = new Random();
        final int nextInt = r.nextInt(5);
        if (nextInt > 1) {
            System.out.println(String.format("Engine is started for car with %s power", this.power));
            return true;
        } else {
            System.out.println("Engine is broken");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                '}';
    }
}
