import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate dateLent;
    private LocalDate dateReturned;

    public Loan(Book book, User user, LocalDate dateLent, LocalDate dateReturned) {
        this.book = book;
        this.user = user;
        this.dateLent = dateLent;
        this.dateReturned = dateReturned;
    }

    public Book getBook() {
        return book;}

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDateLent() {
        return dateLent;
    }

    public void setDateLent(LocalDate dateLent) {
        this.dateLent = dateLent;
    }

    public LocalDate getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(LocalDate dateReturned) {
        this.dateReturned = dateReturned;
    }
}
