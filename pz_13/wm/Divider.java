public class Divider extends WritingMaterials {

    String dividerType;
    boolean metal;

    public Divider(String name, String color, int price, double length, boolean draw, String dividerType, boolean metal) {
        super(name, color, price, length, draw);
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = true; this.dividerType = dividerType; this.metal = metal;
    }

    void draw_circle() {
        System.out.println("Нарисован круг.");
    }

    @Override
    void display() {
        System.out.println("This is Divider");
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }

}
