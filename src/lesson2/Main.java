package lesson2;

public class Main {
    public static void main(String[] args) {

        Person p = new Person(1, "Taras", 26);
        Person p1 = new Person(2, "Ivan", 15);
        Student s = new Student(2, "Andriy", 22, 80, "cs-45");
        Worker w = new Worker(3, "Petro", 45, 15000);
//        System.out.println(p);
//        System.out.println(s);

//        p.method();
//        s.method();
//        w.method();

//        Person[] persons = {p, s, w};
//        for (Person person : persons) {
//            person.method();
//        }

//        p.method("asdf");

//        //static
//        p.method();
//        Person.methodStatic();//static одразу завантажується до оперативної пам’яті та стають доступними
//        System.out.println(Person.a);
//        Person.a = 10;
//        System.out.println(Person.a);
//        System.out.println(p.a);
//        p1.a = 30;
//        System.out.println(p.a);

        // final - class not extends, method not override, поле константа, змінну можна встановити та не можна змінити

        // abstract - не можна створити об’єкт абстрактного класу
        // абстрактний метод може бути тільки у абстрактному класі та не має тіла
        // GeometricFigure geometricFigure = new GeometricFigure();
        Triangle t = new Triangle(1, 4, 4);
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(2, 3);

        GeometricFigure[] figures = {t, c, r};
        double totalSquare = 0;
        for (GeometricFigure figure : figures) {
            totalSquare += figure.calculateSquare();
            figure.draw();
            figure.defMethod();
        }
        System.out.println(totalSquare);
    }
}
