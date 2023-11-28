abstract class Concert {
    protected String name;
    protected String date;
    protected String venue;
    protected double ticketPrice;

    public Concert(String name, String date, String venue, double ticketPrice) {
        this.name = name;
        this.date = date;
        this.venue = venue;
        this.ticketPrice = ticketPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setVenue(String name) {
        this.venue = venue;
    }

    public String getVenue() {
        return venue;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public abstract void getInfo();

    public abstract void buyTicket();
}
