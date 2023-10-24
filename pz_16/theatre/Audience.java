public class Audience {
    private String name;
    private int age;
    private String gender;
    private String seat;

    public Audience(String name, int age, String gender, String seat) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}

