import java.util.ArrayList;
import java.util.List;

public class Stage {
    private String name;
    private String size;
    private List<Prop> props;

    public Stage(String name, String size) {
        this.name = name;
        this.size = size;
        props = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<Prop> getProps() {
        return props;
    }

    public void addProp(Prop prop) {
        props.add(prop);
    }
}
