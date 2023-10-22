public class Library extends Building implements SocialHouse {
    int count_books;
    int count_employee;
    String named_after;

    Library(String name, String adres, int yearBuilt, String architectName, boolean isCultural, int count_books, int count_employee, String named_after) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.architectName = architectName; this.isCultural = isCultural;
        this.count_books = count_books;
        this. count_employee = count_employee;
        this.named_after = named_after;
    }

    //инкапсуляция

    int getCount_books() {
        return this.count_books;
    }

    void setCount_books(int count_books) {
        this.count_books = count_books;
    }

    int getCount_employee() {
        return this.count_employee;
    }

    void setCount_employee(int count_employee) {
        this.count_employee= count_employee;
    }

    String getNamed_after() {
        return this.named_after;
    }

    void setNamed_after(String named_after) {
        this.named_after = named_after;
    }

    void display() {
        System.out.println("Библиотека");
    }

    void showArch() {
        System.out.println("Здание спроектировал: " + architectName);
    }

    void showtoEmpl() {
        System.out.println("Сотрудников в библиотеке: " + this.count_employee;
    }

    @Override
    public String toString() {
        return this.count_books + " " + this.count_employee + " " + this.named_after;
    }

    public void information() {
        System.out.println("Это библиотека");
    }

    public void count_any() {
        System.out.println("Кол-во книг: " + this.count_books);
    }

    public void year_house() {
        System.out.println("Здание построено в: " + this.yearBuilt);
    }
}
