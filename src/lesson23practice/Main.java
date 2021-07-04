package lesson23practice;

public class Main {
    public static void main(String[] args) {

        // #Практическая
        //I
        // а) Определить интерфейс Printable, содержащий метод void print().
        // б) Определить класс Book, реализующий интерфейс Printable.
        // в) Определить класс Magazine, реализующий интерфейс Printable.
        // г) Создать массив типа Printable, который будет содержать книги и журналы.
        // д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
        // е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
        // который выводит на консоль названия только журналов.
        // Создать статический метод printBooks(Printable[] printable) в классе Book,
        // который выводит на консоль названия только книг.
        // Используем оператор instanceof. Смотрите решение задачи в видео.
        //
        //II
        // Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
        // Интерфейс Инструмент содержит метод play()
        // Гитара содержит переменные класса количествоСтрун,
        // Барабан - размер, Труба - диаметр.
        // Создать массив типа Инструмент, содержащий инструменты разного типа.
        // В цикле вызвать метод play() для каждого инструмента,
        // который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

        Printable[] printables = new Printable[]{
                new Book("The War of the Worlds", "H. G. Wells, \u200ERobert Blaisdell, \u200EJohn Green", 1897),
                new Book("The Stainless Steel Rat", "Harry Harrison", 1961),
                new Book("Murder on the Orient Express", "Agatha Christie", 1933),
                new Magazine("Perets", 2021, 12),
                new Magazine("Men's Health", 1995, 7),
                new Magazine("Cosmopolitan", 2004, 4)
        };

        for (Printable printable : printables) {
            printable.print();
        }
        System.out.println();

        Magazine.printMagazines(printables);
        System.out.println();
        Book.printBooks(printables);

        System.out.println();
        System.out.println();

        MusicalInstrument[] musicalInstruments = new MusicalInstrument[7];
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Guitar guitar3 = new Guitar(12);
        Drum drum1 = new Drum("Big");
        Drum drum2 = new Drum("Middle");
        Trumpet trumpet1 = new Trumpet(15);
        Trumpet trumpet2 = new Trumpet(40);

        musicalInstruments[0] = guitar1;
        musicalInstruments[1] = guitar2;
        musicalInstruments[2] = guitar3;
        musicalInstruments[3] = drum1;
        musicalInstruments[4] = drum2;
        musicalInstruments[5] = trumpet1;
        musicalInstruments[6] = trumpet2;
        for (int i = 0; i < musicalInstruments.length; i++) {
            MusicalInstrument musicalInstrument = musicalInstruments[i];
            musicalInstrument.play();
        }
    }
}
