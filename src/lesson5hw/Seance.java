package lesson5hw;

public class Seance implements Comparable<Seance> {
    private int id;
    private Movie movie;
    private Time startTime;
    private Time endTime;
    //   - в конструктор має надходити параметрами значення для перших двох полів, третє поле
    //   повинне обчислюватись (start + duration);

    public Seance() {
    }


    public Seance(int id, Movie movie, Time startTime) {
        this.id = id;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = Time.sumTime(startTime, movie.getDuration());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
        this.endTime = Time.sumTime(this.startTime, this.movie.getDuration());
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
        this.endTime = Time.sumTime(this.startTime, this.movie.getDuration());
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public int compareTo(Seance o) {
        return Time.beforeTime(o.getStartTime(), this.getStartTime());
    }

    @Override
    public String toString() {
        return "Seance{" +
                "id='" + id + '\'' +
                ", movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
