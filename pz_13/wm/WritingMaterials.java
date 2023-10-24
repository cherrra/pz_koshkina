public class  WritingMaterials{
    String name;
    String color;
    int price;
    double length;
    boolean draw;


    //инкапсуляция

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getcolor() {
        return this.color;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getLength() {
        return this.length;
    }

    void setDraw(boolean draw) {
        this.draw = draw;
    }

    boolean getDraw() {
        return this.draw;
    }

    void display() {
        System.out.println("Название: " + this.name + ". Цвет: " + this.color + ". Цена: " + this.price + ". Длина: " + this.length + ". Пишет: " + ((this.draw == true)? "Да": "Нет"));
    }

    void replace_rod(String new_color) {
        this.color = new_color;
    }

    void priceUp(int new_price) {
        this.price += new_price;
    }

    void priceDown(int new_price) {
        this.price -= new_price;
    }

    void draw() {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линию 1. Её цвет -> " + this.color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать.");
        }
    }

    //конструкторы
    WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    WritingMaterials(String name, int price) {
        this.name = name; this.price = price; this.color = "No Color";
    }


    WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.color = "No Color";
        this.name = "No Name";
    }

    WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name = name; this.color = color; this.price = price; this.length = length; this.draw = draw;
    }

    //перегрузка
    void display(int n) {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линий: " + n + ". Их цвет: " + this.color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }


    void display(String color) {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линию." + " Её цвет: " + color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }

    void display(String color, int n) {
        if (this.draw == true) {
            System.out.println(this.name + " провёл линии: " + n + ". " + " Её цвет: " + color);
        }
        else {
            System.out.println(this.name + " не может ничего нарисовать");
        }
    }
}
