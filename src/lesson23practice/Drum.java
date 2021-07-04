package lesson23practice;

public class Drum implements MusicalInstrument{
    private String size;

    public Drum() {
    }

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println(String.format("The drum is playing (%s size)",this.getSize()));
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size='" + size + '\'' +
                '}';
    }
}
