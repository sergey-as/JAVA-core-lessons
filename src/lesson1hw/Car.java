package lesson1hw;

public class Car {
    private String manufacturer;
    private String model;
    private double engine;
    private int power;
    private int maxSpeed;
    private String color;
    private Driver driver;

    public Car() {
    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(String manufacturer, String model, double engine, int power, int maxSpeed, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Car(String manufacturer, String model, double engine, int power, int maxSpeed, String color, Driver driver) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.driver = driver;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if (driver.getExperience() < 3) {
            System.out.println("Error! Driving experience less than three years!");
        } else {
            this.driver = driver;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", driver=" + driver +
                '}';
    }
}
