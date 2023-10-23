public class HighRiseBuilding extends Building implements SocialHouse {
    int count_floor;
    boolean hasElevator;
    String name_owner;


    HighRiseBuilding(String name, String adres, int yearBuilt, String arcName, boolean isCulture, int count_floor, boolean hasElevator, String name_owner) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.arcName = arcName; this.isCulture = isCulture;
        this.count_floor = count_floor;
        this.hasElevator = hasElevator;
        this.name_owner = name_owner;
    }

    //инкапсуляция

    int getCount_floor() {
        return this.count_floor;
    }

    void setCount_floor(int count_floor) {
        this.count_floor = count_floor;
    }

    boolean getHasElevator() {
        return this.hasElevator;
    }

    void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    String getName_owner() {
        return this.name_owner;
    }

    void setName_owner(String name_owner) {
        this.name_owner = name_owner;
    }

    @Override
    public String toString() {
        return this.count_floor + " " + this.hasElevator + " " + this.name_owner;
    }


    void display() {
        System.out.println("Высотка");
    }

    void showTodata() {
        System.out.println("Здание было построено в " + yearBuilt);
    }

    void showEl() {
        System.out.println("Наличие лифта: " + this.hasElevator);
    }

    public void information() {
        System.out.println("Это высотка");
    }

    public void count_any() {
        System.out.println("Кол-во этажей: " + this.count_floor);
    }

    public void year_house() {
        System.out.println("Здание было построено в: " + this.yearBuilt);
    }
}
