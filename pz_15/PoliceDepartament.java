public class PoliceDepartament extends Building implements SocialHouse {
    int count_sotryd;
    int number_office;
    String name_owner;

    PoliceDepartament(String name, String adres, int yearBuilt, String arcName, boolean isCulture, int count_sotryd, int number_office, String name_owner) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.arcName = arcName; this.isCulture = isCulture;
        this.count_sotryd = count_sotryd;
        this.number_office = number_office;
        this.name_owner = name_owner;
    }

    //инкапсуляция

    int getCount_sotryd() {
        return this.count_sotryd;
    }

    void setCount_sotryd(int count_sotryd) {
        this.count_sotryd = count_sotryd;
    }

    int getNumber_office() {
        return this.number_office;
    }

    void setNumber_office(int number_office) {
        this.number_office = number_office;
    }

    String getName_owner() {
        return this.name_owner;
    }

    void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    @Override
    public String toString() {
        return this.count_sotryd + " " + this.number_office + " " + this.name_owner;
    }


    void display() {
        System.out.println("Полицейский участок");
    }

    void showTodata() {
        System.out.println("Здание было построено в " + yearBuilt);
    }

    void showNumber() {
        System.out.println("Номер офиса: " + this.number_office);
    }


    public void information() {
        System.out.println("Это Полицейский участок");
    }

    public void count_any() {
        System.out.println("Кол-во сотрудников: " + this.count_sotryd);
    }

    public void year_house() {
        System.out.println("Здание было построено в: " + this.yearBuilt);
    }
}
