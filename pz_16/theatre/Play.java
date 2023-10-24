import java.util.ArrayList;
import java.util.List;

public class Play {
    private String title;
    private String author;
    private int year;
    private List<Actor> actors;

    public Play(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        actors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
}
