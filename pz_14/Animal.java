public abstract class Animal {

private static int count = 0;

private final int id;

private String name;

private String type;

public Animal() {

this("Animal", "Unknown");

}

public Animal(String name, String type) {

id = ++count;

this.name = name;

this.type = type;

}

public static void staticMethod() {

System.out.println("static method");

}

public final void rename(String name) {

this.name = name;

}

public static final String description = "opisanie class for animals";

@Override

public String toString() {

return "Animal{" +

"id=" + id +

", name='" + name + '\'' +

", type='" + type + '\'' +

'}';

}

}

public final class Fish extends Animal {

public Fish() {

super("Ryba", "fish");

}

//запрет наследования

private Fish(String name, String type) {

super(name, type);

}

//запрет переопределения метода

public final void rename(String name) {

super.rename(name);

}

//запрет изменения свойства

public static final String description = "opisanie class for fish";

}

public class Bird extends Animal {

public Bird() {

super("Chirik", "bird");

}

}

public class Insect extends Animal {

public Insect() {

super("Juja", "insect");

}

}
