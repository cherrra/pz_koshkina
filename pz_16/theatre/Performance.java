import java.util.List;

public class Performance {
    private Play play;
    private Director director;
    private Stage stage;
    private List<Actor> actors;
    private List<Prop> props;
    private Costume costume;
    private List<Ticket> tickets;
    private List<Audience> audience;

    public Performance(Play play, Director director, Stage stage, List<Actor> actors, List<Prop> props, Costume costume, List<Ticket> tickets, List<Audience> audience) {
        this.play = play;
        this.director = director;
        this.stage = stage;
        this.actors = actors;
        this.props = props;
        this.costume = costume;
        this.tickets = tickets;
        this.audience = audience;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public List<Prop> getProps() {
        return props;
    }

    public void addProp(Prop prop) {
        props.add(prop);
    }

    public Costume getCostume() {
        return costume;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Audience> getAudience() {
        return audience;
    }

    public void addAudience(Audience audience) {
        this.audience.add(audience);
    }
}
