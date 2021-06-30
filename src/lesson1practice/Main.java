package lesson1practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1: Ребятушки, на практику задание" + "\n" +
                "Создать класс золушка, с полями id, name, size. Создать массив золушек." + "\n" +
                "Создать класс Принц с полями id, name, foundedShoe. Проитерировать массив золушек и найти кто потерял туфельку." + "\n" +
                " Как видите это задание вы уже делали, только теперь все через классы, все поля приватные, обращение через геттеры." + "\n" +
                " Джентельменский набор не забудьте!");
        System.out.println();

        Cinderella cinderella1 = new Cinderella(1, "Olya", 37);
        Cinderella cinderella2 = new Cinderella(2, "Marina", 38);
        Cinderella cinderella3 = new Cinderella(3, "Oksana", 39);
        Cinderella cinderella4 = new Cinderella();
        cinderella4.setId(4);
        cinderella4.setName("Cinderella");
        cinderella4.setSize(35);
        Cinderella cinderella5 = new Cinderella(5, "Tamila", 41);

        Cinderella[] cinderellas = new Cinderella[5];
        cinderellas[0] = cinderella1;
        cinderellas[1] = cinderella2;
        cinderellas[2] = cinderella3;
        cinderellas[3] = cinderella4;
        cinderellas[4] = cinderella5;
        System.out.println("Cinderellas:");
        for (Cinderella cinderella : cinderellas) {
            System.out.println(cinderella);
        }
        System.out.println();
        Prince prince = new Prince(555, "Gregor", 35);
        System.out.println(prince);

        System.out.println();

        for (int i = 0; i < cinderellas.length; i++) {
            System.out.println(i);
            Cinderella cinderella = cinderellas[i];
            if (cinderella.getSize() == prince.getFoundedShoe()) {
                System.out.println("Prince Gregor has found his Cinderella!");
                System.out.println(cinderella);
                break;
            }
        }
    }
}
