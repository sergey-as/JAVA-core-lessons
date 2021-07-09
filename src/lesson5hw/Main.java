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
        //   - методи: addSeances (String day, Seance...seance) (додає набір сеансів в
        //   конкретний день), addSeance (Seance, String) (додає один сеанс в конкретний день),
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

//        for (Days day : Days.values()) {
//            System.out.println(day);
//        }
        Time time = new Time(14, 15);
        Movie movie = new Movie(1, "asd", new Time(1, 35));
        Seance seance = new Seance(movie, time);
        System.out.println(seance);
        seance.setStartTime(new Time(15, 30));
        System.out.println(seance);
        movie.setDuration(new Time(2, 35));
        seance.setMovie(movie);
        System.out.println(seance);

    }
}
