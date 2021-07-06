package lesson4;

import sun.rmi.runtime.NewThreadAction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add("asdf");
//        list.add(new Person(1,"dsada",25));

//        List<String> list = new LinkedList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        System.out.println(list );
//        for (String s : list) {
//            System.out.println(s);
//        }

//        List<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        list.add(1,"new");
//        System.out.println(list.get(3));
//        System.out.println(list.size());
//        System.out.println(list.indexOf("jsdfhsf"));
//        System.out.println(list.lastIndexOf("jsdfhsf"));
//
//        System.out.println(list );
//        for (String s : list) {
//            System.out.println(s);
//        }

//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person(1, "Taras", 54));
//        personList.add(new Person(2, "Maria", 35));
//        personList.add(new Person(3, "Petro", 40));
//        personList.add(new Person(4, "Julia", 22));

//        for (Person person : personList) {
//            if (person.getName().endsWith("a")) {
//                System.out.println(person);
//            }
//        }
//        System.out.println();
//        for (Person person : personList) {
//            if (person.getId() % 2 != 0) {
//                System.out.println(person);
//                person.setAge(person.getAge() - 5);
//                System.out.println(person);
//            }
//        }

//        // НЕ ПРАЦЮЄ
//        for (Person person : personList) {
//            if (person.getName().endsWith("a")) {
//                personList.remove(person);
//            }
//        }

//        final Iterator<Person> iterator = personList.iterator();
//        final Person next = iterator.next();
//        System.out.println(next);
//        System.out.println(iterator.next());
//        while (iterator.hasNext()) {
//            final Person person = iterator.next();
//            if (person.getName().endsWith("a")) {
//                iterator.remove();
//            }
//        }
//        for (Person person : personList) {
//            System.out.println(person);
//        }

//        Set<String> setLinked = new LinkedHashSet<>();
//        setLinked.add("first");
//        setLinked.add("second");
//        setLinked.add("third");
//        System.out.println(setLinked);
//        for (String s : setLinked) {
//            System.out.println(s.hashCode());
//        }

//        Set<String> set = new HashSet<>();
//        set.add("first");
//        set.add("second");
//        set.add("third");
//        set.add("second");
//        System.out.println(set);
//        for (String s : set) {
//            System.out.println(s.hashCode());
//        }

//        Set<Person> personSet = new HashSet<>();
//        personSet.add(new Person(1, "Taras", 54));
//        personSet.add(new Person(2, "Maria", 35));
//        personSet.add(new Person(3, "Petro", 40));
//        personSet.add(new Person(4, "Julia", 22));
//        personSet.add(new Person(2, "Maria", 35));
////        System.out.println(personSet);
//        for (Person person : personSet) {
//            System.out.println(person);
//        }

//        Set<String> set = new TreeSet<>();
//        set.add("first");
//        set.add("second");
//        set.add("third");
//        System.out.println(set);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(12, "Taras", 54));
        personSet.add(new Person(12, "Maria", 35));
        personSet.add(new Person(35, "Petro", 40));
        personSet.add(new Person(4, "Julia", 22));
        for (Person person : personSet) {
            System.out.println(person);
        }

        String a = "a";
        String b = "b";

        System.out.println(a.compareTo(b));

    }
}
