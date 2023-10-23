public class ShoppingCenter extends Building implements SocialHouse {
    int count_shops;
    boolean hasFood;
    String name_owner;


    ShoppingCenter(String name, String adres, int yearBuilt, String arcName, boolean isCulture, int count_shops, boolean hasFood, String name_owner) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.arcName = arcName; this.isCulture = isCulture;
        this.count_shops = count_shops;
        this.hasFood = hasFood;
        this.name_owner = name_owner;
    }

    //инкапсуляция

    int getCount_books() {
        return this.count_shops;
    }

    void setCount_books(int count_shops) {
        this.count_shops = count_shops;
    }

    boolean getHasFood() {
        return this.hasFood;
    }

    void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    String getName_owner() {
        return this.name_owner;
    }

    void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    @Override
    public String toString() {
        return this.count_shops + " " + this.hasFood + " " + this.name_owner;
    }


    void display() {
        System.out.println("Торговый центр");
    }

    void showTodata() {
        System.out.println("Здание было построено в " + yearBuilt);
    }

    void showtoRepair() {
        System.out.println("Наличие фудкорта " + this.hasFood);
    }

    public void information() {
        System.out.println("Это торговый центр");
    }

    public void count_any() {
        System.out.println("Кол-во магазинов: " + this.count_shops);
    }

    public void year_house() {
        System.out.println("Здание было построено в: " + this.yearBuilt);
    }
}
