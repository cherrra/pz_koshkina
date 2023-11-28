class Ticket {
    private Concert concert;
    private String seat;
    private double price;

    public Ticket(Concert concert, String seat, double price) {
        this.concert = concert;
        this.seat = seat;
        this.price = price;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getSeat() {
        return seat;
    }

    public Concert getConcert() {
        return concert;
    }

    public double getPrice() {
        return price;
    }
}
