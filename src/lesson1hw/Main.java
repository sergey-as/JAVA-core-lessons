package lesson1hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("HW 1: створити та описати (конструктори, геттери, сеттери) різні класи: Client, Car...");

        Driver driver1 = new Driver("Petro", "Petrov", 38, 7);
        Driver driver2 = new Driver("Ivan", "Ivanov", 45, 15);
        Driver driver3 = new Driver("Sydor", "Sydoriv", 25, 2);
        Driver[] drivers = {driver1, driver2, driver3};
        System.out.println(Arrays.toString(drivers));

        Car[] cars = new Car[3];
        cars[0] = new Car("Honda", "Civic", 1.6, 95, 180, "red");
        cars[0].setDriver(drivers[0]);

        cars[1] = new Car();
        cars[1].setManufacturer("Toyota");
        cars[1].setModel("Camry");
        cars[1].setEngine(2.2);
        cars[1].setPower(170);
        cars[1].setMaxSpeed(220);
        cars[1].setColor("gray");
        cars[1].setDriver(drivers[1]);

        cars[2] = new Car("VAZ", "Kalina");

        System.out.println(Arrays.toString(cars));

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (i == 2) {
                car.setColor("Baklajan");
                car.setDriver(driver3);
            }
            System.out.println(car);
        }


    }
}
