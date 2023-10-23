public class Library extends Building implements SocialHouse {
    int count_books;
    int count_employee;
    String name_owner;

    Library(String name, String adres, int yearBuilt, String arcName, boolean isCulture, int count_books, int count_employee, String name_owner) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.arcName = arcName; this.isCulture = isCulture;
        this.count_books = count_books;
        this.count_employee = count_employee;
        this.name_owner = name_owner;
    }

    //инкапсуляция

    int getCount_books() {
        return this.count_books;
    }

    void setCount_books(int count_books) {
        this.count_books = count_books;
    }

    int getСount_employee() {
        return this.count_employee;
    }

    void setCount_employee(int count_employee) {
        this.count_employee = count_employee;
    }

    String getName_owner() {
        return this.name_owner;
    }

    void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    void display() {
        System.out.println("Библиотека");
    }

    void showYear() {
        System.out.println("Здание было построено в " + yearBuilt);
    }

    void showEmpl() {
        System.out.println("Кол-во сотрудников: " + this.count_employee);
    }

    @Override
    public String toString() {
        return this.count_books + " " + this.count_employee + " " + this.name_owner;
    }

    public void information() {
        System.out.println("Это библиотека");
    }

    public void count_any() {
        System.out.println("Кол-во книг: " + this.count_books);
    }

    public void year_house() {
        System.out.println("Здание было построено в: " + this.yearBuilt);
    }
}
