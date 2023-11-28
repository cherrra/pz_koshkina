class JazzFestival extends Concert implements Festival {
    private String[] musicians;
    private String vibe;

    public JazzFestival(String name, String date, String venue, double ticketPrice, String vibe) {
        super(name, date, venue, ticketPrice);
        this.musicians = musicians;
        this.vibe = vibe;
    }

    public void setVibe(String vibe) {
        this.vibe = vibe;
    }

    public String getVibe() {
        return ("Free Jazz");
    }

    public void setMusicians(String[] musicians) {
        this.musicians = musicians;
    }

    public String[] getMusicians() {
        return musicians;
    }
    @Override
    public void getInfo() {
        System.out.println("Джаз-фестиваль: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Место: " + venue);
        System.out.println("Музыканты: " + String.join(", ", musicians));
        System.out.println("Настроение: " + vibe);
        System.out.println("Стоимость: " + ticketPrice);
    }

    @Override
    public void buyTicket() {
        System.out.println("Билет на джаз-фестиваль купил: " + name);
    }

    @Override
    public void getLineUp() {
        System.out.println("Состав участников фестиваля: "  + String.join(", ", musicians));
    }

    @Override
    public void getAttractions() {

    }
}
