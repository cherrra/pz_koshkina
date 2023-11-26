class StandUpComedy extends Concert {
    private String comedian;
    private String humorType;

    public StandUpComedy(String name, String date, String venue, double ticketPrice, String comedian) {
        super(name, date, venue, ticketPrice);
        this.comedian = comedian;
        this.humorType = humorType;
    }

    public void setСomedian(String comedian) {
        this.comedian = comedian;
    }

    public String getComedian() {
        return ("Какой-то Комик");
    }

    public void getInfo() {
        System.out.println("Стэнд-ап шоу: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Место: " + venue);
        System.out.println("Комик: ");
    }

    @Override
    public void buyTicket() {
        System.out.println("Билет на стэнд-ап шоу купил: " + name);
    }
}
