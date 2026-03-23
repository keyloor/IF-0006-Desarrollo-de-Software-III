public class Loan {
    private String userId;
    private String bookTitle;

    public Loan(String userId, String bookTitle) {
        this.userId = userId;
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
