public class University extends Building implements SocialHouse {
    int count_students;
    int count_prep;
    String name_city;

    University(String name, String adres, int yearBuilt, String architectName, boolean isCultural, int count_students, int count_prep, String name_city) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.architectName = architectName; this.isCultural = isCultural;
        this.count_students = count_students;
        this.count_prep = count_prep;
        this.name_city = name_city;
    }

    //инкапсуляция

    int getCount_students() {
        return this.count_students;
    }

    void setCount_students(int count_students) {
        this.count_students = count_students;
    }

    int getCount_prep() {
        return this.count_prep;
    }

    void setCount_prep(int count_prep) {
        this.count_prep = count_prep;
    }

    String getName_city() {
        return this.name_city;
    }

    void setName_city(String name_city) {
        this.name_city = name_city;
    }

    @Override
    public String toString() {
        return this.count_students + " " + this.count_prep + " " + this.name_city;
    }

    void display() {
        System.out.println("Университет");
    }

    void showArch() {
        System.out.println("Здание спроектировал " + architectName);
    }

    void showPrep() {
        System.out.println("Кол-во преподавателей: " + this.count_prep);
    }


    public void information() {
        System.out.println("Это университет");
    }

    public void count_any() {
        System.out.println("Кол-во студентов: " + this.count_students);
    }

    public void year_house() {
        System.out.println("Здание построено в: " + this.yearBuilt());
    }
    
}
