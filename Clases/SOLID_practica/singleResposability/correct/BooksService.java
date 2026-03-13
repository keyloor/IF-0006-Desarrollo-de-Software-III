
import java.util.ArrayList;

public class BooksService {
    private ArrayList<Book> books;
    private ArrayList<Loan> loans;
    
    BooksService() {
        books = new ArrayList<Book>();
        loans = new ArrayList<Loan>();
    }

    public void addBook(String title, String author, int copies) {
        books.add(new Book(title, author, copies));
    }

    public boolean returnBook(String userId, String bookTitle) {
        for (Loan loan : loans) {

            if (loan.getUserId().equals(userId) && loan.getBookTitle().equals(bookTitle)) {

                loans.remove(loan);

                for (Book book : books) {

                    if (book.getTitle().equals(bookTitle)) {
                        book.setCopies(book.getCopies() + 1);
                    }

                    return true;
                }
            }
        }

        return false;
    }

    public boolean loanBook(String userId, String bookTitle) {

        for (Book book : books) {

            if (book.getTitle().equals(bookTitle) && book.getCopies() > 0) {

                book.setCopies(book.getCopies() - 1);

                loans.add(new Loan(userId, bookTitle));

                return true;
            }
        }

        return false;
    }
}
