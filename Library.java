import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> bookCatalog;
    private Map<String, Book> borrowedBooks;

    public Library() {
        bookCatalog = new HashMap<>();
        borrowedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        bookCatalog.put(book.getId(), book);
    }

    public void borrowBook(String id) {
        Book book = bookCatalog.get(id);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            borrowedBooks.put(id, book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not available or does not exist.");
        }
    }

    public void returnBook(String id) {
        Book book = borrowedBooks.get(id);
        if (book != null) {
            book.setAvailable(true);
            borrowedBooks.remove(id);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("This book was not borrowed from this library.");
        }
    }

    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : bookCatalog.values()) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void listAllBooks() {
        System.out.println("All Books:");
        for (Book book : bookCatalog.values()) {
            System.out.println(book);
        }
    }
}
