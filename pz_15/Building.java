public abstract class Building {
    private String name;
    private String adres;
    private int yearBuilt;
    private String architectName;
    private boolean isCultural;

    public Building(String name, String adres, int yearBuilt, String architectName, boolean isCultural) {
        this.name = name;
        this.adres = adres;
        this.yearBuilt = yearBuilt;
        this.architectName = architectName;
        this.isCultural = isCultural;
    }

    //инкапсуляция
    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public String getArchitectName() {
        return architectName;
    }

    public boolean isCultural() {
        return isCultural;
    }


    //абстрактный метод display()
    public abstract void display();

    @Override
    public String toString() {
        return "Название: " + name + "\n" +
                "Адрес: " + adres + "\n" +
                "Год постройки: " + yearBuilt + "\n" +
                "Имя архитектора: " + architectName + "\n" +
                "Является культурным памятником: " + isCultural + "\n";
    }
}
