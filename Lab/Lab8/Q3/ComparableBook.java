package Lab.Lab8.Q3;

public class ComparableBook implements Comparable<ComparableBook> {
    private int bookId;
    private String bookTitle;

    public ComparableBook(int ID, String title) {
        this.bookId = ID;
        this.bookTitle = title;
    }

    public int getID() {
        return this.bookId;
    }

    public String getTitle() {
        return this.bookTitle;
    }

    public String toString() {
        return String.format("(%d) %s", getID(), getTitle());
    }

    @Override
    public int compareTo(ComparableBook o) {
        return Integer.compare(this.getID(), o.getID());
    }
}
