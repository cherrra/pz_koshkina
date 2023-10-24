public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Норвежский лес", "Харуки Мураками", 1987, 368, 2);
        Book book2 = new Book("Портрет Дориана Грея", "Оскар Уайльд", 1890, 320, 3);
        Book book3 = new Book("Щегол", "Донна Тарт", 2013, 832, 1);

        Library library = new Library("Публичная библиотека", "ул. Пушкинская");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User user1 = new User("Сергей", 25);
        User user2 = new User("Екатерина", 23);

        Librarian librarian = new Librarian("Иван Александрович", 38, "главный библиотекарь");

        librarian.lendBook(book1, user1);
        librarian.lendBook(book2, user1);
        librarian.lendBook(book3, user2);

        librarian.lendBook(book3, user1);

        librarian.returnBook(book1, user1);
        librarian.returnBook(book2, user1);
        librarian.returnBook(book3, user2);

        librarian.reserveBook(book3, user1);

        System.out.println(library.searchBookByTitle("Щегол"));
    }
}
