public class Library {

    private BooksService booksService;
    private UserService userService;

    public Library() {
        booksService = new BooksService();
        userService =  new UserService();
    }

    //Book Service
    public void addBook(String title, String author, int copies) {
        
        booksService.addBook(title, author, copies);
    }

    public boolean returnBook(String userId, String bookTitle) {
        return booksService.returnBook(userId, bookTitle);
    }

    public boolean loanBook(String userId, String bookTitle) {
        return booksService.loanBook(userId, bookTitle);
    }

    //User Service
    public void addUser(String name, String id, String email) {
        userService.addUser(name, id, email);
    }

    

    

}
