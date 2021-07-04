package lesson3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
//        final CarType sedan = CarType.valueOf("SEDAN");
//        System.out.println(sedan);

//        final CarType[] values = CarType.values();
//        for (CarType value : values) {
//            if (value.getUkrainianTranslation().equals("Хетчбек")) {
//                System.out.println(value);
//                value.setUkrainianTranslation("Ліфтбек");
//            }
//
//            System.out.println(value);
//            System.out.println(value.draw());
//        }

//        Engine engine = new Engine(1.5,160);
//        Car car = new Car("Honda", 26000, engine, CarType.SEDAN);
//        System.out.println(car);
//
//        engine.setPower(engine.getPower()*2);
//        System.out.println(engine);
//        System.out.println(car);
//        Car car1 = new Car("Kia", 16000, engine, CarType.SEDAN); // engine - ???

//        Car car = new Car("Honda", 12000, new Engine(1.6,190),CarType.SEDAN);
//        car.getEngine().startEngine();
//        car.startCar();


        int[] array = {1, 5, 1, 4};
        try {
//            System.out.println(array[5]);
            System.out.println(array[2]);
            System.out.println("After in try");
            throw new ArithmeticException("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oh oh! Exception is thrown because of: " + e.getMessage()+" "+1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Oh oh! Exception is thrown because of: " + e.getMessage()+" "+2);
        } catch (Exception e) {
            System.out.println("Oh oh! Just Exception is thrown because of: " + e.getMessage()+" "+2);
        } finally {
            System.out.println("I'm finally bitches!");
        }
        System.out.println("After");


    }
}
