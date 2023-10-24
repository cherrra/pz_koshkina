public class Pen extends WritingMaterials {

    int CountColor;
    boolean auto;

    public Pen(String name, String color, int price, double length, boolean draw, int CountColor, boolean auto) {
        super(name, color, price, length, draw);
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = true; this.CountColor = CountColor; this.auto = auto;
    }

    void writeMyName(String name) {
        System.out.println("Ваше имя: " + name);
    }

    @Override
    void display() {
        System.out.println("This is Pen");
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }

}
