package lesson5;

import lesson3.CarType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static Map<Person, List<Car>> map5 = new HashMap<>();


    public static void main(String[] args) throws ParseException {
        //DATE:
//        Date date0 = new Date(0);
//        System.out.println(date0);
//        Date date = new Date();
//        System.out.println(date);
//
//        System.out.println(System.currentTimeMillis());
//
//        String stringDate = "12-01-1995";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        final Date date1 = simpleDateFormat.parse(stringDate);
//        System.out.println(date1);
//        System.out.println(simpleDateFormat.format(date1));
//
//        final Calendar instance = Calendar.getInstance();
//        System.out.println(instance);
//        instance.set(2021, 3, 25);
//        System.out.println(instance);
//
//        LocalDate localDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        System.out.println(localDate);


        //COMPARATOR:
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person(1, "Taras", 54));
//        personList.add(new Person(2, "Maria", 35));
//        personList.add(new Person(3, "Petro", 40));
//        personList.add(new Person(4, "Julia", 22));
//
//        //Collections.sort();//раніше було так у java 7
//        // Погано, не робити:
//        personList.sort(new PersonAgeComparator());
//        System.out.println(personList);
//
//        // Правильніше так (анонімний клас):
//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//        personList.sort(comparator);
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//        personList.add(new Person(5, "Ostap", 36));
//        System.out.println("-----------");
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//
//        // Найбільш правильно так (лямбда-функції):
////        Comparator<Person> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
////        personList.sort(comparator);
//        personList.sort((o1, o2) -> o1.getAge() - o2.getAge());
//
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//        personList.add(new Person(5, "Ostap", 36));
//        System.out.println("-----------");
//        for (Person person : personList) {
//            System.out.println(person);
//        }

        //MAP:
//        //HashMap - зберігає з сортуванням по хешу ключів
//        Map<String, Person> map1 = new HashMap<>();
//        map1.put("first", new Person(1,"Ostap", 23));
//        map1.put("second", new Person(2,"Julia", 27));
//        map1.put("third", new Person(3,"Petro", 18));
//        map1.put("second", new Person(4,"Maria", 25));
//        System.out.println(map1);
//        //LinkedHashMap - зберігає з сортуванням по порядку додавання
//        Map<String, Person> map2 = new LinkedHashMap<>();
//        map2.put("first", new Person(1,"Ostap", 23));
//        map2.put("second", new Person(2,"Julia", 27));
//        map2.put("third", new Person(3,"Petro", 18));
//        map2.put("second", new Person(4,"Maria", 25));
//        System.out.println(map2);
//        //TreeMap - зберігає у порядку природнього сортуванням по ключу
//        //тому для ключа повинен бути інтерфейс Comparable
//        System.out.println("---PersonComparable---");
//        Map<PersonComparable, Person> map4 = new TreeMap<>();
//        map4.put(new PersonComparable(1,"Ostap", 23), new Person(1,"Ostap", 23));
//        map4.put(new PersonComparable(3,"Petro", 18), new Person(3,"Petro", 18));
//        map4.put(new PersonComparable(2,"Julia", 27), new Person(2,"Julia", 27));
//        map4.put(new PersonComparable(4,"Maria", 25), new Person(4,"Maria", 25));
//        System.out.println(map4);

//        Map<String, Person> map3 = new TreeMap<>();
//        map3.put("first", new Person(1, "Ostap", 23));
//        map3.put("second", new Person(2, "Julia", 27));
//        map3.put("third", new Person(3, "Petro", 18));
//
//        final Person removed = map3.remove("second");
//        System.out.print("removed: ");
//        System.out.println(removed);
//        System.out.println(map3);
//        map3.replace("third", new Person(4, "Maria", 25));
//        System.out.println(map3);
//        System.out.println(map3.get("first"));
//        System.out.println(map3.containsKey("second"));
//        System.out.println(map3.keySet());
//        System.out.println(map3.values());
//        System.out.println(map3.get("djgsj"));
//        System.out.println(map3.getOrDefault("djgsj", new Person(111, "jyt", 21)));
//
//        printMap1(map3);

        addNewPerson(new Person(1, "Petro", 26));
//        addCarToPerson(new Person(1, "Petro", 26), new Car("Audi", 40000, CarType.SUV));
        addCarToPerson(1, new Car("Audi", 40000, CarType.SUV));
        addNewPerson(new Person(2, "Marta", 36));
//        addCarToPerson(new Person(2, "Marta", 36), new Car("Honda", 30000, CarType.SEDAN));
//        addCarToPerson(new Person(2, "Marta", 36), new Car("Infinity", 50000, CarType.SUV));
        addCarToPerson(2, new Car("Honda", 30000, CarType.SEDAN));
        addCarToPerson(2, new Car("Infinity", 50000, CarType.SUV));
        System.out.println();
        printMap(map5);
        System.out.println();
        deleteCarFromPerson(2, new Car("Infinity", 50000, CarType.SUV));
        printMap(map5);


    }

    public static void addNewPerson(Person person) {
        map5.put(person, new ArrayList<>());
    }

    //    public static void addCarToPerson(Person person, Car car) {
//        if (map5.containsKey(person)) {
//            final List<Car> cars = map5.get(person);
//            cars.add(car);
//            System.out.println(String.format("Car %s is added for person %s",car.getBrand(),person.getName()));
//        } else {
//            System.out.println("No such person: " + person.getName());
//        }
//    }
    public static void addCarToPerson(int id, Car car) {
        final Set<Person> keys = map5.keySet();
        for (Person personKey : keys) {
            if (personKey.getId() == id) {
                final List<Car> cars = map5.get(personKey);
                cars.add(car);
                System.out.println(String.format("Car %s is added for person %s", car.getBrand(), personKey.getName()));
                return;
            }
        }
    }

    public static void deleteCarFromPerson(int id, Car car) {
        final Set<Person> keys = map5.keySet();
        for (Person personKey : keys) {
            if (personKey.getId() == id) {
                final List<Car> cars = map5.get(personKey);
                for (Car car1 : cars) {
                    if (car1.getBrand() == car.getBrand() && car1.getPrice() == car.getPrice() && car1.getCarType() == car.getCarType()) {
                        cars.remove(car1);
                        System.out.println(String.format("Car %s is removed for person %s", car.getBrand(), personKey.getName()));
                        return;
                    }
                }

            }
        }
    }

    public static void printMap(Map<Person, List<Car>> map) {
        final Set<Map.Entry<Person, List<Car>>> set = map.entrySet();
        for (Map.Entry<Person, List<Car>> entry : set) {
            System.out.println(entry.getKey() + ":");
            final List<Car> cars = entry.getValue();
            for (Car car : cars) {
                System.out.println("\t" + car);
            }
        }
    }

    public static void printMap1(Map map) {
        final Set<Map.Entry> set = map.entrySet();
        for (Map.Entry entry : set) {
            System.out.println(entry.getKey() + ":");
            System.out.println("\t" + entry.getValue());
        }
    }
}
