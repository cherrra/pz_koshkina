import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private Film film;
    private LocalDateTime startTime;
    private Hall hall;
    private List<Ticket> soldTickets;

    public Session(Film film, LocalDateTime startTime, Hall hall) {
        this.film = film;
        this.startTime = startTime;
        this.hall = hall;
        this.soldTickets = new ArrayList<>();
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public List<Ticket> getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(List<Ticket> soldTickets) {
        this.soldTickets = soldTickets;
    }
}
