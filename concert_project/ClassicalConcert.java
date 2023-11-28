class ClassicalConcert extends Concert {
    private String composer;
    private String orchestra;

    public ClassicalConcert(String name, String date, String venue, double ticketPrice, String composer) {
        super(name, date, venue, ticketPrice);
        this.composer = composer;
        this.orchestra = orchestra;
    }

    public String getOrchestra() {
        return orchestra;
    }

    public void setOrchestra(String orchestra) {
        this.orchestra = orchestra;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getComposer() {
        return ("Шин Джихо");
    }

    @Override
    public void getInfo() {
        System.out.println("Классический концерт: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Место: " + venue);
        System.out.println("Композитор: " + composer);
        System.out.println("Оркестр: " + orchestra);
        System.out.println("Стоимость: " + ticketPrice);
    }
    @Override
    public void buyTicket() {
        System.out.println("Билет на классический концерт купил: " + name);
    }
}
