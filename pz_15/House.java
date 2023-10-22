public class House extends Building implements LivingHouse {
    int count_room;
    boolean hasGarden;
    int count_resident;

    House(String name, String adres, int yearBuilt, String architectName, boolean isCulture, int count_room, boolean hasGarden, int count_resident) {
        this.name = name; this.adres = adres; this.yearBuilt = yearBuilt; this.architectName = architectName; this.isCultural() = isCultural;
        this.count_room = count_room;
        this.hasGarden = hasGarden;
        this.count_resident = count_resident;
    }

    //инкапсуляция

    int getCount_room() {
        return this.count_room;
    }

    void setCount_room(int count_room) {
        this.count_room = count_room;
    }

    int getHasGarden() {
        return this.hasGarden = hasGarden;
    }

    void setHasGarden(int hasGarden) {
        this.hasGarden = hasGarden;
    }

    String getCount_resident() {
        return this.count_resident;
    }

    void setCount_resident(String count_resident) {
        this.count_resident = count_resident;
    }

    @Override
    public String toString() {
        return this.count_room + " " + this.hasGarden + " " + this.count_resident;
    }

    void display() {
        System.out.println("Дом");
    }

    void showArch() {
        System.out.println("Здание спроектировал: " + architectName);
    }

    void showRoom() {
        System.out.println("Комнат в доме: " + this.count_room);
    }


    public void information() {
        System.out.println("Это жилое здание");
    }

    public void count_any() {
        System.out.println("Кол-во жителей: " + this.count_resident);
    }

    public void year_house() {
        System.out.println("Здание построено в: " + this.yearBuilt);
    }
}
