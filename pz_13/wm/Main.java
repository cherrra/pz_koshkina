public class Main {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials("Ручка", "красная", 145, 15.6, false);
        pen.display();
        pen.priceUp(30);
        pen.priceDown(20);
        pen.draw();
        pen.display();
        WritingMaterials pen2 = new WritingMaterials("Линейка", "Синяя");
        WritingMaterials pen3 = new WritingMaterials("Циркуль", 45);
        pen2.display();
        pen3.display();
        pen3.setName("Карандаш");
        pen3.setPrice(34);
        pen3.display();
        pen.display("зелёный");
        pen.display("оранжевый", 5);
        pen.display(4);
        System.out.println("\n");

        //предметы
        Pen new_pen = new Pen("Ручка", "розовая", 15, 8.1, true, 12, true);
        new_pen.writeMyName("ктоя");
        new_pen.display();
        System.out.println("\n");

        Rules new_rule = new Rules("Линейка", "оранжевая", 19, 9.2, false, true);
        new_rule.measure();
        new_rule.display();
        System.out.println("\n");

        Divider new_divider = new Divider("Циркуль", "белый", 24, 12.2, true, "округлый",  true);
        new_divider.draw_circle();
        new_divider.display();
    }
}


