public class Rules extends WritingMaterials {

    double length;
    boolean wood;

    public Rules(String name, String color, int price, double length, boolean draw, boolean wood) {
        super(name, color, price, length, draw);
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = false; this.wood = wood;
    }

    void measure() {
        System.out.println("Сейчас померяем длину.");
    }

    @Override
    void display() {
        System.out.println("This is Rules");
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }

}
