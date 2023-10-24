import java.time.LocalDate;

public class Reservation {
    private Book book;
    private User user;
    private LocalDate reservationDate;

    public Reservation(Book book, User user, LocalDate reservationDate) {
        this.book = book;
        this.user = user;
        this.reservationDate = reservationDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }
}
