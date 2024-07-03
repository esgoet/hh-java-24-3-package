import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        books = new Book[10];
    }
    public Library(Book[] books) {
        this.books = books;
    }

    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
