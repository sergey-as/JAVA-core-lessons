package lesson5hw;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cinema {
    //Cinema:
    //   - TreeMap<Days, Schedule>, Time open, Time close;
    //   - врахувати час відкриття і закриття при формуванні сеансів!
    //   - методи:
    //   addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
    //   addSeance (Seance, String) (додає один сеанс в конкретний день),
    //   removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
    //   removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день,
    //   який задається параметром String).

    private String name;
    private Map<Days, Schedule> cinema;
    private Time timeOpen;
    private Time timeClose;

    public Cinema() {
        this.cinema = new TreeMap<>();
    }

    public Cinema(String name, Time timeOpen, Time timeClose) {
        this.name = name;
        this.cinema = new TreeMap<>();
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Days, Schedule> getCinema() {
        return cinema;
    }

    public void setCinema(Map<Days, Schedule> cinema) {
        this.cinema = cinema;
    }

    public Time getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Time timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Time getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(Time timeClose) {
        this.timeClose = timeClose;
    }

    //   - врахувати час відкриття і закриття при формуванні сеансів!
    private boolean seanceIsValid(Seance seance) {
        boolean isValid = true;
        if (Time.beforeTime(seance.getStartTime(), this.timeOpen) == 1) {
            System.out.println(String.format("Seance %s can not be added, because startTime %s before timeOpen %s",
                    seance, seance.getStartTime(), this.timeOpen));
            isValid = false;
        }
        if (Time.beforeTime(seance.getEndTime(), this.timeClose) == -1) {
            System.out.println(String.format("Seance %s can not be added, because endTime %s after timeClose %s",
                    seance, seance.getEndTime(), this.timeClose));
            isValid = false;
        }
        return isValid;
    }


    //   - методи:
    //   addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
    public void addSeances(String day, Schedule schedule) {
        System.out.println("Adding seances:");
        Days d = Days.valueOf(day.toUpperCase());
        boolean isOK = true;
        for (Seance seance : schedule.getSchedule()) {
            if (!seanceIsValid(seance)) {
                isOK = false;
            }
        }
        if (isOK) {
            this.cinema.put(d, schedule);
        }
    }

    //   addSeance (Seance, String) (додає один сеанс в конкретний день),
    public void addSeance(String day, Seance seance) {
        System.out.println("Adding seance:");
        Days d = Days.valueOf(day.toUpperCase());
        boolean isOK = seanceIsValid(seance);
        if (!isOK) {
            return;
        }

        final Set<Days> days = this.cinema.keySet();
        if (!days.contains(d)) {
            this.cinema.put(d, new Schedule());
        }
        Schedule schedule = this.cinema.get(d);
        schedule.addSeance(seance);
        System.out.println(String.format("For cinema %s in day %s added Seance %s",
                this.name, d.name(), seance));
    }

    //   removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
    public void removeMovie(Movie movie) {
        System.out.println("Removing movie:");
        for (Schedule schedule : this.cinema.values()) {
            if (schedule.getSchedule().removeIf(seance -> seance.getMovie().getId() == movie.getId())) {
                System.out.println(String.format("Movie %s removed from Cinema %s",
                        movie, this.getName()));
            }
        }
    }

    //   removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).
    public void removeSeance(String day, Seance seance) {
        System.out.println("Removing seance:");
        Days d = Days.valueOf(day.toUpperCase());

        Schedule schedule = this.cinema.get(d);
        schedule.removeSeance(seance);

        System.out.println(String.format("For cinema %s in day %s removed Seance %s",
                this.name, d.name(), seance));

    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", cinema=" + cinema +
                ", timeOpen=" + timeOpen +
                ", timeClose=" + timeClose +
                '}';
    }
}
