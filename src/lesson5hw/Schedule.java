package lesson5hw;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule implements Comparator<Seance> {
    //Schedule:
    //   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
    //   - Сортування по startTime.
    //   - методи: addSeance (Seance), removeSeance (Seance);
    private int id;
    private Set<Seance> schedule;

    public Schedule() {
        this.schedule = new TreeSet<Seance>();
    }

    public Schedule(int id) {
        this.id = id;
        this.schedule = new TreeSet<Seance>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Seance> getSchedule() {
        return schedule;
    }

    public void setSchedule(Set<Seance> schedule) {
        this.schedule = schedule;
    }

    void addSeance(Seance seance) {
        this.schedule.add(seance);
    }

    void removeSeance(Seance seanceToRemove) {
        this.schedule.removeIf(seance -> seance.getId() == seanceToRemove.getId());
    }

    @Override
    public int compare(Seance o1, Seance o2) {
        return 0;
    }

    @Override
    public String toString() {
        String s = "\n";
        for (Seance seance : schedule) {
            s += seance+"\n";
        }
        return "Schedule{" +
                "id=" + id +
                ", schedule:" + s +
                '}';
    }
}
