public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("1", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("2", "1984", "George Orwell"));
        library.addBook(new Book("3", "To Kill a Mockingbird", "Harper Lee"));

        // List all books
        library.listAllBooks();

        // Borrow a book
        library.borrowBook("1");

        // List available books after borrowing
        library.listAvailableBooks();

        // Return a book
        library.returnBook("1");

        // List available books after returning
        library.listAvailableBooks();
    }
}
