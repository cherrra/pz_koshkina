public class Illustrator {
    private String name;
    private int experience;
    private String country;

    public Illustrator(String name, int experience, String country) {
        this.name = name;
        this.experience = experience;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
