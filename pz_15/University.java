public class University extends Building implements SocialHouse {
    int count_students;
    int count_prep;
    String name_owner;

    University(String name, String adres, int yearBuilt, String arcName, boolean isCulture, int count_students, int count_prep, String name_owner) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.arcName = arcName; this.isCulture = isCulture;
        this.count_students = count_students;
        this.count_prep = count_prep;
        this.name_owner = name_owner;
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

    String getName_owner() {
        return this.name_owner;
    }

    void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    @Override
    public String toString() {
        return this.count_students + " " + this.count_prep + " " + this.name_owner;
    }

    void display() {
        System.out.println("Университет");
    }

    void showTodata() {
        System.out.println("Здание было построено в " + yearBuilt);
    }

    void showtoPrep() {
        System.out.println("Кол-во преподавателей: " + this.count_prep);
    }


    public void information() {
        System.out.println("Это университет");
    }

    public void count_any() {
        System.out.println("Кол-во студентов: " + this.count_students);
    }

    public void year_house() {
        System.out.println("Здание было построено в: " + this.yearBuilt);
    }
}
