class MusicConcert extends Concert {
    private String performer;
    private String genre;

    public MusicConcert(String name, String date, String venue, double ticketPrice, String performer, String genre) {
        super(name, date, venue, ticketPrice);
        this.performer = performer;
        this.genre = genre;
    }

    @Override
    public void getInfo() {
        System.out.println("Концерт: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Место: " + venue);
        System.out.println("Исполнитель: " + performer);
        System.out.println("Жанр: " + genre);
        System.out.println("Стоимость: " + ticketPrice);
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getPerformer() {
        return ("Noize MC");
    }
    @Override
    public void buyTicket() {
        System.out.println("Билет на концерт купил: " + name);
    }
}
