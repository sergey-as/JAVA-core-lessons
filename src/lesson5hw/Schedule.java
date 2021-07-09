package lesson5hw;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    //Schedule:
    //   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
    //   - Сортування по startTime.
    //   - методи: addSeance (Seance), removeSeance (Seance);
    private final Set<Seance> schedule = new TreeSet<Seance>();

    void addSeance(Seance seance) {
        this.schedule.add(seance);
    }

    static void removeSeance(Seance seance) {

    }

}
