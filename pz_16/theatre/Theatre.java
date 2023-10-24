import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String name;
    private String address;
    private List<Play> plays;

    public Theatre(String name, String address) {
        this.name = name;
        this.address = address;
        plays = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Play> getPlays() {
        return plays;
    }

    public void addPlay(Play play) {
        plays.add(play);
    }
}
