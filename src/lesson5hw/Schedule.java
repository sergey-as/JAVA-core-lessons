package lesson5hw;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule implements Comparator<Seance> {
    private static int idCount = 0;
    //Schedule:
    //   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
    //   - Сортування по startTime.
    //   - методи: addSeance (Seance), removeSeance (Seance);
    private int id;
    private Set<Seance> schedule;

    public Schedule() {
        Schedule.setIdCount(Schedule.getIdCount() + 1);
        this.id = Schedule.getIdCount();
        this.schedule = new TreeSet<Seance>();
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Schedule.idCount = idCount;
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
        System.out.println(String.format("Seance %s added to schedule id=%s",
                seance, this.getId()));
    }

    void removeSeance(Seance seanceToRemove) {
        if (this.schedule.removeIf(seance -> seance.getId() == seanceToRemove.getId())) {
            System.out.println(String.format("Seance %s removed from schedule id=%s",
                    seanceToRemove, this.getId()));
        }
    }

    @Override
    public int compare(Seance o1, Seance o2) {
        return 0;
    }

    @Override
    public String toString() {
        String s = "\n";
        for (Seance seance : schedule) {
            s += seance + "\n";
        }
        return "Schedule{" +
                "id=" + id +
                ", schedule:" + s +
                '}';
    }
}
