public class PoliceDepartament extends Building implements SocialHouse {
    int count_sotryd;
    int year_repair;
    int numberOffice;

    PoliceDepartament(String name, String adres, int yearBuilt, String architectName, boolean isCultural, int count_sotryd, int year_repair, String name_city) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.architectName = architectName; this.isCultural = isCultural;
        this.count_sotryd = count_sotryd;
        this.year_repair = year_repair;
        this.numberOffice = numberOffice;
    }

    //инкапсуляция

    int getCount_books() {
        return this.count_sotryd;
    }

    void setCount_books(int count_sotryd) {
        this.count_sotryd = count_sotryd;
    }

    int getYear_repair() {
        return this.year_repair;
    }

    void setYear_repair(int year_repair) {
        this.year_repair = year_repair;
    }

    String getNumberOffice() {
        return this.numberOffice;
    }

    void setNumberOffice(int numberOffice) {
        this.numberOffice = numberOffice;
    }

    @Override
    public String toString() {
        return this.count_sotryd + " " + this.year_repair + " " + this.numberOffice;
    }


    void display() {
        System.out.println("Полицейский участок");
    }

    void showArch() {
        System.out.println("Здание спроектировал " + architectName);
    }

    void showOffice() {
        System.out.println("Номер офиса"  + this.numberOffice);
    }


    public void information() {
        System.out.println("Это полицейский участок");
    }

    public void count_any() {
        System.out.println("Кол-во сотрудников: " + this.count_sotryd);
    }

    public void year_house() {
        System.out.println("Здание построено в: " + this.yearBuilt);
    }


}
