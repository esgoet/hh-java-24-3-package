//import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private Book[] books;
//    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {
        books = new Book[10];
    }
    public Library(Book[] books) {
        this.books = books;
    }

//    public Library(ArrayList<Book> books) {
//        this.books = books;
//    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < newBooks.length -1; i++) {
            newBooks[i] = books[i];
        }
        newBooks[newBooks.length - 1] = book;
        books = newBooks;

        //with ArrayList
//        books.add(book);

    }

    public void deleteBook(Book book) {
        Book[] newBooks = new Book[books.length - 1];
        int currentIndex = 0;
        for (int i = 0; i < newBooks.length; i++) {
            if (!books[i].equals(book)) {
                newBooks[i] = books[i];
            } else {
                currentIndex = i;
                break;
            }
        }
        for (int i = currentIndex; i < newBooks.length; i++) {
            newBooks[i] = books[i + 1];
        }
        books = newBooks;

        // with ArrayList
//        books.remove(book);
    }

    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
