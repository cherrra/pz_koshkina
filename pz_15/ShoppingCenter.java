public class ShoppingCenter extends Building implements SocialHouse {
    int count_shops;
    int year_repair;
    boolean hasFoodCourt;


    ShoppingCenter(String name, String adres, int yearBuilt, String architectName, boolean isCultural, int count_shops, int year_repair, boolean hasFoodCourt) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.architectName = architectName; this.isCultural() = isCultural;
        this.count_shops = count_shops;
        this.year_repair = year_repair;
        this.hasFoodCourt = hasFoodCourt;
    }

    @Override
    public String toString() {
        return this.count_shops + " " + this.year_repair + " " + this.hasFoodCourt;
    }


    void display() {
        System.out.println("Торговый центр");
    }

    void showArch() {
        System.out.println("Здание спроектировал: " + architectName);
    }

    void showtoRepair() {
        System.out.println("Ремонт в здании был в " + this.year_repair);
    }

    public void information() {
        System.out.println("Это Торговый Центр");
    }

    public void count_any() {
        System.out.println("Количество магазинов: " + this.count_shops);
    }

    public void year_house() {
        System.out.println("Здание построено в: " + this.yearBuilt);
    }


    //Инкапсуляция.

    int getCount_books() {
        return this.count_shops;
    }

    void setCount_books(int count_shops) {
        this.count_shops = count_shops;
    }

    int getYear_repair() {
        return this.year_repair;
    }

    void setYear_repair(int year_repair) {
        this.year_repair = year_repair;
    }

    String getHasFoodCourt() {
        return this.hasFoodCourt;
    }

    void setHasFoodCourt(boolean hasFoodCourt) {
        this.hasFoodCourt = hasFoodCourt;
    }
}
