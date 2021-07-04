package lesson23practice;

public class Guitar implements MusicalInstrument{
    private int numberOfStrings;

    public Guitar() {
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(String.format("The guitar is playing (%s strings).",this.getNumberOfStrings()));
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }
}
