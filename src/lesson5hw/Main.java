package lesson5hw;

public class Main {
    public static void main(String[] args) {
        //Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
        //enum Days:
        //  - прописати дні тижня;
        //Time:
        //    - int min, int hour;
        //    - передбачити межі для цих полів (для min 0..59, для hour 0..23);
        //Movie:
        //   - String title, Time duration (або ж можете забити на власний Time і
        //   використати java.time.Duration, як і тут, так і в інших класах. це за власним бажанням)
        //Seance:
        //   - Movie movie, Time startTime, Time endTime;
        //   - в конструктор має надходити параметрами значення для перших двох полів, третє поле
        //   повинне обчислюватись (start + duration);
        //Schedule:
        //   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
        //   - Сортування по startTime.
        //   - методи: addSeance (Seance), removeSeance (Seance);
        //Cinema:
        //   - TreeMap<Days, Schedule>, Time open, Time close;
        //   - врахувати час відкриття і закриття при формуванні сеансів!
        //   - методи:
        //   addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
        //   addSeance (Seance, String) (додає один сеанс в конкретний день),
        //   removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
        //   removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день,
        //   який задається параметром String).
        //
        //Main class:
        //   - створення об'єкту Cinema;
        //   - викликаємо всі методи Cinema
        //
        //Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.
        // Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка.
        // Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.

        Cinema cinema = new Cinema("Kyiv", new Time(9, 0), new Time(22, 0));

        Movie movie1 = new Movie(1, "Movie1", new Time(1, 35));
        Movie movie2 = new Movie(2, "Movie2", new Time(2, 15));
        Movie movie3 = new Movie(3, "Movie3", new Time(1, 45));
        Movie movie4 = new Movie(4, "Movie4", new Time(1, 50));
        Movie movie5 = new Movie(5, "Movie5", new Time(2, 50));

        Seance seance1 = new Seance(1, movie1, new Time(9, 30));
        Seance seance2 = new Seance(2, movie2, new Time(12, 0));
        Seance seance3 = new Seance(3, movie3, new Time(15, 30));
        Seance seance4 = new Seance(4, movie4, new Time(18, 0));
        Seance seance5 = new Seance(5, movie5, new Time(20, 30));
        Seance seance6 = new Seance(6, movie1, new Time(20, 0));

        Schedule schedule1 = new Schedule();
        schedule1.addSeance(seance1);
        schedule1.addSeance(seance2);
        schedule1.addSeance(seance3);
        schedule1.addSeance(seance4);
        schedule1.addSeance(seance5);
        System.out.println(schedule1);
        System.out.println();

        cinema.addSeances("monday", schedule1);
        System.out.println(cinema);
        System.out.println();

        schedule1.removeSeance(seance5);
        cinema.addSeances("monday", schedule1);
        System.out.println(cinema);
        System.out.println();

        Schedule schedule2 = new Schedule();
        schedule2.addSeance(seance1);
        schedule2.addSeance(seance2);
        schedule2.addSeance(seance3);
        schedule2.addSeance(seance4);
        System.out.println(schedule2);
        System.out.println();

        cinema.addSeances("tuesday", schedule2);
        System.out.println(cinema);
        System.out.println();

        cinema.addSeance("tuesday", seance6);
        System.out.println(cinema);
        System.out.println();

        cinema.addSeance("sunday", new Seance(7, movie5, new Time(10, 15)));
        cinema.addSeance("sunday", new Seance(8, movie3, new Time(15, 15)));
        cinema.addSeance("sunday", new Seance(9, movie1, new Time(18, 15)));
        System.out.println(cinema);
        System.out.println();

        cinema.removeMovie(movie1);
        System.out.println(cinema);
        System.out.println();

        cinema.removeSeance("MONDAY",seance2);
        System.out.println(cinema);
        System.out.println();

    }
}
