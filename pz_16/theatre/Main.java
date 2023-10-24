import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Джон", 30, "муж", 5);
        Actor actor2 = new Actor("Жана", 25, "жен", 7);
        Play play1 = new Play("Ромео и Джульетта", "Уильям Шекспир", 1597);
        play1.addActor(actor1);
        play1.addActor(actor2);
        System.out.println("Пьеса 1: " + play1.getTitle() + ", написал " + play1.getAuthor() + " в " + play1.getYear());
        System.out.println("Актеры:");
        for (Actor actor : play1.getActors()) {
            System.out.println("- " + actor.getName() + ", лет " + actor.getAge() + ", " + actor.getGender() + ", опыт " + actor.getExperience() + " лет");
        }
        Theatre theatre1 = new Theatre("Большой", "Лондон");
        theatre1.addPlay(play1);
        System.out.println("Театр 1: " + theatre1.getName() + ", город " + theatre1.getAddress());
        Director director1 = new Director("Питер", 55, "муж", 20);
        System.out.println("Директор 1: " + director1.getName() + ", лет " + director1.getAge() + ", " + director1.getGender() + ", опыт " + director1.getExperience() + " лет");
        Stage stage1 = new Stage("Большая сцена", "10x10");
        Prop prop1 = new Prop("Меч", "Средневековый меч");
        stage1.addProp(prop1);
        System.out.println("Сцена 1: " + stage1.getName() + ", размер " + stage1.getSize());
        System.out.println("Реквизит 1:");
        for (Prop prop : stage1.getProps()) {
            System.out.println("- " + prop.getName() + ": " + prop.getDescription());
        }
        Costume costume1 = new Costume("Костюм Ромео", "Костюм в стиле ренессанс");
        Performance performance1 = new Performance(play1, director1, stage1, play1.getActors(), stage1.getProps(), costume1, new ArrayList<>(), new ArrayList<>());
        System.out.println("Выступление 1:");
        System.out.println("- Пьеса: " + performance1.getPlay().getTitle());
        System.out.println("- Директор: " + performance1.getDirector().getName());
        System.out.println("- Сцена: " + performance1.getStage().getName());
        System.out.println("- Актеры:");
        for (Actor actor : performance1.getActors()) {
            System.out.println("  - " + actor.getName());
        }
        System.out.println("- Реквизит:");
        for (Prop prop : performance1.getProps()) {
            System.out.println("  - " + prop.getName());
        }
        System.out.println("- Костюмы: " + performance1.getCostume().getName());
        Ticket ticket1 = new Ticket(1, 1000, "25-10-2023");
        performance1.addTicket(ticket1);
        System.out.println("Билет 1: №" + ticket1.getNumber() + ", цена " + ticket1.getPrice() + ", дата " + ticket1.getDate());
        Audience audience1 = new Audience("Мари", 30, "жен", "A1");
        performance1.addAudience(audience1);
        System.out.println("Зритель 1: " + audience1.getName() + ", лет " + audience1.getAge() + ", " + audience1.getGender() + ", место " + audience1.getSeat());
    }
}
