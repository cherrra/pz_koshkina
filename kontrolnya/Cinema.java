import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Film> films;
    private List<Employee> employees;
    private List<Hall> halls;
    private List<Client> clients;
    private List<Session> sessions;

    public Cinema() {
        this.films = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.halls = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.sessions = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void removeFilm(Film film) {
        films.remove(film);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void removeHall(Hall hall) {
        halls.remove(hall);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void removeSession(Session session) {
        sessions.remove(session);
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void sellTicket(Session session, int seat, Client client) {
        if (seat > session.getHall().getCapacity()) {
            throw new IllegalArgumentException("Неверно");
        }
        if (session.getSoldTickets().stream().anyMatch(t -> t.getSeat() == seat)) {
            throw new IllegalArgumentException("Продано");
        }
        double price = session.getFilm().getRating() >= 8 ? session.getHall().getType().equals("VIP") ? 300 : 200 : session.getHall().getType().equals("VIP") ? 500 : 350;
        Ticket ticket = new Ticket(session.getSoldTickets().size() + 1, session.getFilm(), session.getStartTime(), seat, price);
        session.getSoldTickets().add(ticket);
        client.getAddress();
    }

}
