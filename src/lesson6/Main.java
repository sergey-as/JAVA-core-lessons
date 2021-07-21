package lesson6;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;
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
        list.add(new Person(1, "Ptero", "Ukrainian", LocalDate.of(1996, 11, 20)));
        list.add(new Person(2, "Taras", "Polish", LocalDate.of(1991, 1, 10)));
        list.add(new Person(3, "Marta", "Ukrainian", LocalDate.of(1993, 6, 14)));
        list.add(new Person(4, "Oksana", "Polish", LocalDate.of(2005, 5, 2)));
        list.add(new Person(5, "Olenka", "Hungarian", LocalDate.of(1991, 1, 10)));

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

        // 3.1 Посортувати по айді
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
//        final Optional<Person> max = list.stream()
//                .max((o1, o2) -> o2.getBirthDate().compareTo(o1.getBirthDate()));
//        System.out.println(max);
//        //if (person != null){}
//        //max.orElse(new Person());
//        //max.orElseGet(() -> new Person());
//        //max.orElseThrow(() -> new );
//        //final Optional<String> s = max.map(person -> person.getName());
//        //if (max.isPresent()){}
//
//        final List<String> collect = list
//                .stream()
//                .filter(person -> {
//                    System.out.println("filter");
//                    return person.getName().endsWith("a");
//                })
//                .map(person -> {
//                    System.out.println("map");
//                    return person.getName();
//                })
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        //filter
//        //filter
//        //map
//        //filter
//        //map
//        //filter
//        //filter
//        //map
//        //[Oksana, Marta, Olenka]

        // 7. Погрупувати людей по національності
//        final Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getNationality));
//        collect.entrySet().forEach(System.out::println);

        // 8. Порахувати щасливе число по даті народження: скласти усі цифри дати народження.
        // Та посортувати по ньому.
        // Приклад: 12 (день) 03 (місяць) 1975 (рік) = 1 2 0 3 1 9 7 5=28=2 8=10=1 0=1.
        list.stream()
                .peek(person -> {
                    LocalDate date = person.getBirthDate();
                    final int year = date.getYear();
                    final int monthValue = date.getMonthValue();
                    final int dayOfMonth = date.getDayOfMonth();
                    List<Integer> integers = toDigits(year);
                    integers.addAll(toDigits(monthValue));
                    integers.addAll(toDigits(dayOfMonth));
                    int sum = 0;
                    while (integers.size() > 1) {
                        sum = integers.stream().mapToInt(Integer::intValue).sum();
                        integers = toDigits(sum);
                    }
                    person.setLuckyNum(sum);
                })
                .sorted((o1, o2) -> o1.getLuckyNum()- o2.getLuckyNum())
                .forEach(System.out::println);
    }

    public static List<Integer> toDigits(int num) {
        List<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num = num / 10;
        }
        return digits;
    }
}
