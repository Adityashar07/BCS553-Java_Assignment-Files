// Create class Book with int pages and method isLong() that returns true when pages is more than 300.
// In main, create a book with 450 pages and one with 120 pages, print isLong() for each, one per line.

class Book {
    int pages;

    boolean isLong() {
        return pages > 300;
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.pages = 450;
        Book b2 = new Book();
        b2.pages = 120;

        System.out.println(b1.isLong());
        System.out.println(b2.isLong());
    }
}
