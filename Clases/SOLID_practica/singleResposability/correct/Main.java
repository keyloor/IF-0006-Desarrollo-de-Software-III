public class Main {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        Library library = new Library();

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 3);
        library.addBook("1984", "George Orwell", 5);
        library.addBook("To Kill a Mockingbird", "Harper Lee", 2);

        library.addUser("Alice", "U001", "alice@example.com");

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        );

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver
        
        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver que

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver qu

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver que

        IOManager.print(
            library.returnBook("U001", "The Great Gatsby")
                ? "Book returned successfully"
                : "Book not returned"
        ); // ver

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        ); // ver que

        IOManager.print(
            library.loanBook("U001", "The Great Gatsby")
                ? "Book loaned successfully"
                : "Book not available"
        );
    }
}