package lesson1practice;

public class Prince {
    private int id;
    private String name;
    private int foundedShoe;

    public Prince() {
    }

    public Prince(int id, String name, int foundedShoe) {
        this.id = id;
        this.name = name;
        this.foundedShoe = foundedShoe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundedShoe() {
        return foundedShoe;
    }

    public void setFoundedShoe(int foundedShoe) {
        this.foundedShoe = foundedShoe;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundedShoe=" + foundedShoe +
                '}';
    }
}
