public class Publisher {
    private String name;
    private int foundingYear;
    private String country;

    public Publisher(String name, int foundingYear, String country) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
