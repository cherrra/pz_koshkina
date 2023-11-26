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

    public abstract void getInfo();

    public abstract void buyTicket();
}
