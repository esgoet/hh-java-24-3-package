public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen", 1243456645);
        Book book2 = new Book("Emma", "Jane Austen", 1743894732);
        Library library = new Library(new Book[] {book1, book2});

        System.out.println(library);



    }
}
