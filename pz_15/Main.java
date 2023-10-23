public class Main {
    public static void main(String[] args) {
        Library library = new Library("Публичная библиотека", "ул.Пушкинская", 1900, "Роман", true, 3457, 43, "Елизавета Ивановна");
        library.display();
        library.count_any();
        System.out.println("Кол-во сотрудников: " + library.getСount_employee());
        library.year_house();
        library.information();
        System.out.println(library.toString());

        System.out.println("\n");

        House house = new House("Дом №33", "ул. Зорге", 1995, "Павел", false, 5, 2001, "Егор Алексеевич");
        house.display();
        house.count_any();
        System.out.println("Ремонт был в " + house.getYear_repair());
        System.out.println("Владелец здания: " + house.getName_owner());
        house.information();
        System.out.println(house.toString());

        System.out.println("\n");

        PoliceDepartament policedep = new PoliceDepartament("Полицейский участок", "ул. Будённовский", 1956, "Юрий", true, 28, 3, "Кристина Викторовна");
        policedep.display();
        policedep.count_any();
        System.out.println("Номер офиса: " + policedep.getNumber_office());
        policedep.year_house();
        policedep.information();
        System.out.println(policedep.toString());

        System.out.println("\n");

        University university = new University("ЮФУ", "ул. Большая Садовая", 1921, "Сергей", false, 4100, 100, "Юлия Сергеевна");
        university.display();
        university.count_any();
        System.out.println("Кол-во преподавателей: " + university.getCount_prep());
        university.year_house();
        university.information();
        System.out.println(university.toString());

        System.out.println("\n");

        ShoppingCenter shoppingCenter = new ShoppingCenter("Золотой Вавилон", "ул. Малиновского", 1912, "Владимир", false, 120, true, "Сергей Юрьевич");
        shoppingCenter.display();
        shoppingCenter.count_any();
        System.out.println("Наличие фудкорта: " + shoppingCenter.getHasFood());
        System.out.println("Владелец здания: " + shoppingCenter.getName_owner());
        shoppingCenter.year_house();
        shoppingCenter.information();
        System.out.println(shoppingCenter.toString());

        System.out.println("\n");

        HighRiseBuilding hrb = new HighRiseBuilding("Белый ангел", "ул. Левобережная", 1980, "Владислав", false, 15, true, "Иван Александрович");
        hrb.display();
        hrb.count_any();
        System.out.println("Наличие лифта: " + hrb.getHasElevator());
        System.out.println("Владелец здания: " + hrb.getName_owner());
        hrb.year_house();
        hrb.information();
        System.out.println(hrb.toString());
    }
}
