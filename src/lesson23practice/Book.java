package lesson23practice;

public class Book implements Printable {
    private String titleOfBook;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String titleOfBook, String author, int year) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.year = year;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void printBooks(Printable[] printables){
        for (Printable printable : printables) {
            if (printable instanceof Book){
                System.out.println(((Book) printable).getTitleOfBook());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print Book{" +
                "titleOfBook='" + titleOfBook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}');

    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfBook='" + titleOfBook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
