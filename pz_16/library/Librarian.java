import java.time.LocalDate;

public class Librarian {
    private String name;
    private int age;
    private String position;

    public Librarian(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void lendBook(Book book, User user) {
        if (book.getAvailableCopies() > 0) {
            user.borrowBook(book);
            book.decreaseAvailableCopies();
            Loan loan = new Loan(book, user, LocalDate.now(), null);
            System.out.println("Книгу " + book.getTitle() + " взял(а) " + user.getName());
        } else {
            System.out.println("Нет доступных копий: " + book.getTitle());
        }
    }

    public void returnBook(Book book, User user) {
        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            book.increaseAvailableCopies();
            Loan loan = new Loan(book, user, null, LocalDate.now());
            System.out.println("Книгу " + book.getTitle() + " вернул(а) " + user.getName());
        } else {
            System.out.println(user.getName() + " не брал(а) книгу " + book.getTitle());
        }
    }

    public void reserveBook(Book book, User user) {
        if (book.getAvailableCopies() == 0) {
            Reservation reservation = new Reservation(book, user, LocalDate.now());
            System.out.println("Книгу " + book.getTitle() + " забронировал(а) " + user.getName());
        } else {
            System.out.println("Не забронированная книга: " + book.getTitle());
        }
    }
}
