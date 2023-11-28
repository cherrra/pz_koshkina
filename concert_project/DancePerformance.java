class DancePerformance extends Concert {
    private String dancers;
    private String danceStyle;

    public DancePerformance(String name, String date, String venue, double ticketPrice, String dancers) {
        super(name, date, venue, ticketPrice);
        this.dancers = dancers;
        this.danceStyle = danceStyle;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    public String getDanceStyle() {
        return danceStyle;
    }

    public void setDancers(String dancers) {
        this.dancers = dancers;
    }

    public String getDancers() {
        return ("MegaDance");
    }

    @Override
    public void getInfo() {
        System.out.println("Танцевальное выступление: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Место: " + venue);
        System.out.println("Танцоры: " + dancers);
        System.out.println("Стиль: " + danceStyle);
        System.out.println("Стоимость: " + ticketPrice);
    }

    @Override
    public void buyTicket() {
        System.out.println("Билет на танцевальное исполнение: " + name);
    }
}
