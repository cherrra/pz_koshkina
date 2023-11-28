class RockFestival extends Concert implements Festival {
    private String[] bands;
    private String attractions;

    public RockFestival(String name, String date, String venue, double ticketPrice, String attractions) {
        super(name, date, venue, ticketPrice);
        this.bands = bands;
        this.attractions = attractions;
    }


    public void setBands(String[] bands) {
        this.bands = bands;
    }

   public String getBands() {
        return ("Linkin Park, The Cure");
    }
    @Override
    public void buyTicket() {
        System.out.println("Билет на рок-фестиваль купил: " + name);
    }

    @Override
    public void getLineUp() {
        System.out.println("Состав участников фестиваля: " + name + ": " + String.join(", ", bands));
    }

    @Override
    public void getInfo() {
        System.out.println("Рок-фестиваль: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Место: " + venue);
        System.out.println("Группы: " + String.join(", ", bands));
        System.out.println("Достопримечательность: " + attractions);
        System.out.println("Стоимость: " + ticketPrice);
    }



    public void getAttractions() {
        System.out.println("Достопримечательности фестиваля: " + name + ": " + attractions);
    }
}
