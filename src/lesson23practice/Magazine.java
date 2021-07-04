package lesson23practice;

public class Magazine implements Printable {
    private String titleOfMagazine;
    private int year;
    private int issue;

    public Magazine() {
    }

    public Magazine(String titleOfMagazine, int year, int issue) {
        this.titleOfMagazine = titleOfMagazine;
        this.issue = issue;
    }

    public String getTitleOfMagazine() {
        return titleOfMagazine;
    }

    public void setTitleOfMagazine(String titleOfMagazine) {
        this.titleOfMagazine = titleOfMagazine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(((Magazine) printable).getTitleOfMagazine());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print Magazine{" +
                "titleOfMagazine='" + titleOfMagazine + '\'' +
                ", year=" + year +
                ", issue=" + issue +
                '}');
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "titleOfMagazine='" + titleOfMagazine + '\'' +
                ", year=" + year +
                ", issue=" + issue +
                '}';
    }
}
