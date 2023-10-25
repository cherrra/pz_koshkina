import java.time.LocalDateTime;

public class Ticket {
    private int number;
    private Film film;
    private LocalDateTime dateTime;
    private int seat;
    private double price;

    public Ticket(int number, Film film, LocalDateTime dateTime, int seat, double price) {
        this.number = number;
        this.film = film;
        this.dateTime = dateTime;
        this.seat = seat;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
