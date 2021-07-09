package lesson6;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        // Елементи функціонального програмування:
//        (p1) -> boolean = Predicate;
//        () -> result = Supplier; //Постачальник
//        (p1) -> void = Consumer;
//        (p1) -> result = Function;
//        (p1,p2) -> result = BiFunction;
//Thread
//Stream
//I/O Stream

//        Predicate<Person> personBornIn1991 = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getBirthDate().getYear() == 1991;
//            }
//        };
//        Function<Integer, Person> i = new Function<Integer, Person>() {
//            @Override
//            public Person apply(Integer integer) {
//                return null;
//            }
//        };

//        final boolean b = personBornIn1991.test(new Person(1, "Ptero", LocalDate.of(1991, 11, 20)));
//        System.out.println(b);

//        Person[] persons = new Person[5];
//        Arrays.stream(persons);

//        Stream.builder().add(new Person()).add(new Person()).build(). ..;
//        Stream.of(new Person(), new Person()). ..;

        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Ptero", LocalDate.of(1996, 11, 20)));
        list.add(new Person(4, "Oksana", LocalDate.of(2005, 5, 2)));
        list.add(new Person(3, "Marta", LocalDate.of(1993, 6, 14)));
        list.add(new Person(2, "Taras", LocalDate.of(1991, 1, 10)));
        list.add(new Person(5, "Olenka", LocalDate.of(1991, 1, 10)));

        // 1. Вивести всі елементи на екран
//        list.forEach(person -> System.out.println(person));
//        System.out.println();
//        list.stream().forEach(person -> System.out.println(person));

        // 2. Створити колекцію імен
////        list.stream()
////                .map(new Function<Person, String>() {
////                    @Override
////                    public String apply(Person person) {
////                        return person.getName();
////                    }
////                });
//        final List<String> names = list.stream()
////                .map(person -> person.getName())
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(names);

        // 3.1 Поортувати по айді
//        list.stream().sorted((o1, o2) -> o1.getId() - o2.getId())
//                .forEach(System.out::println);
        // 3.2 Поортувати по року
//        list.stream().sorted((o1, o2) -> o1.getBirthDate().getYear() - o2.getBirthDate().getYear())
//                .forEach(System.out::println);

        // 4. Витягрути усіх повнолітніх
//        final int currentYear = LocalDate.now().getYear();
//        final List<Person> adults = list.stream()
//                .filter(person -> currentYear - person.getBirthDate().getYear() >= 18)
//                .collect(Collectors.toList());
//        adults.forEach(System.out::println);

        //// 5. Вибрати три перших та повернути їх у зворотньому порядку
        // 5. Вибрати всіх, чиє ім’я закінчується на "а" та повернути перших два
////        list.stream().skip(5). ..;
////        list.stream().limit(3).
//        final List<Person> a = list.stream()
//                .filter(person -> person.getName().endsWith("a"))
//                .limit(2)
//                //.forEach()//завершує стрім, а peek() робить те саме, але не завершує
//                .peek(System.out::println)
//                .collect(Collectors.toList());

        // 6. Знайти найтсаршу людину
        final Optional<Person> max = list.stream()
                .max((o1, o2) -> o2.getBirthDate().compareTo(o1.getBirthDate()));
        System.out.println(max);
53:30
        // 7. Погрупувати людей по національності




    }
}
