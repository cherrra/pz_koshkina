public class House extends Building implements LivingHouse {
    int count_resident;
    int year_repair;
    String name_owner;

    House(String name, String adres, int yearBuilt, String arcName, boolean isCulture, int count_resident, int year_repair, String name_owner) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.arcName = arcName; this.isCulture = isCulture;
        this.count_resident = count_resident;
        this.year_repair = year_repair;
        this.name_owner = name_owner;
    }

    //инкапсуляция

    int getCount_resident() {
        return this.count_resident;
    }

    void setCount_resident(int count_resident) {
        this.count_resident = count_resident;
    }

    int getYear_repair() {
        return this.year_repair;
    }

    void setYear_repair(int year_repair) {
        this.year_repair = year_repair;
    }

    String getName_owner() {
        return this.name_owner;
    }

    void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    @Override
    public String toString() {
        return this.count_resident + " " + this.year_repair + " " + this.name_owner;
    }

    void display() {
        System.out.println("Дом");
    }

    void showTodata() {
        System.out.println("Здание было построено в " + yearBuilt);
    }

    void showtoRepair() {
        System.out.println("Ремонт в здании был проведён в " + this.year_repair);
    }


    public void information() {
        System.out.println("Это жилое здание");
    }

    public void count_any() {
        System.out.println("Количество жителей: " + this.count_resident);
    }

    public void year_house() {
        System.out.println("Количество лет зданию: " + this.yearBuilt);
    }
}
