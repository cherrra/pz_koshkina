import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //создание объекта кинотеатра
        Cinema cinema = new Cinema();

        //добавление фильмов
        Film film1 = new Film("Общество мертвых поэтов", "драма", 128, "Питер Уир", Arrays.asList("Робин Уильямс", "Итан Хоук"), "Мегакрутой преподаватель английской литературы мотивирует.", 8.9, 1989);
        Film film2 = new Film("Клуб завтрак", "комедийная драма", 97, "Джон Хьюз", Arrays.asList("Молли Рингуолд", "Джадд Нельсон "), "Подростки пытаются разобраться в себе.", 8.6, 1985);
        cinema.addFilm(film1);
        cinema.addFilm(film2);

        //добавление залов
        Hall hall1 = new Hall(1, 300, "обычнй");
        Hall hall2 = new Hall(2, 50, "VIP");
        cinema.addHall(hall1);
        cinema.addHall(hall2);

        //создание сеансы
        Session session1 = new Session(film1, LocalDateTime.of(2023, 10, 25, 17, 30), hall1);
        Session session2 = new Session(film2, LocalDateTime.of(2023, 10, 25, 19, 50), hall2);
        cinema.addSession(session1);
        cinema.addSession(session2);

        //создание клиента
        Client client = new Client("Иван Алексеев", "123-123", "ул. Зорге");

        //покупка билета
        try {
            cinema.sellTicket(session1, 5, client);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //вывод списка проданных билетов для сеанса
        System.out.println("Проданные билеты на сеанс 1:");
        System.out.println("\n");
        for (Ticket ticket : session1.getSoldTickets()) {
            System.out.println("Номер билета: " + ticket.getNumber());
            System.out.println("Название фильма: " + ticket.getFilm().getTitle());
            System.out.println("Дата и время: " + ticket.getDateTime());
            System.out.println("Место: " + ticket.getSeat());
            System.out.println("Цена: " + ticket.getPrice());
            System.out.println();
        }
    }
}
