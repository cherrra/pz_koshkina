public abstract class WritingMaterials {

private static int count = 0;

private final int id;

private String name;

private String color;

public WritingMaterials() {

this("Writing Materials", "Unknown");

}

public WritingMaterials(String name, String color) {

id = ++count;

this.name = name;

this.color = color;

}

public static void staticMethod() {

System.out.println("static method");

}

public static final String description = "opisanie class for writing materials.";

@Override

public String toString() {

return "WritingMaterials{" +

"id=" + id +

", name='" + name + '\'' +

", color='" + color + '\'' +

'}';

}

}

public final class Ruler extends WritingMaterials {

public Ruler() {

super("Ruler", "Red");

}

//запрет наследования

private Ruler(String name, String color) {

super(name, color);

}

//запрет изменения свойства

public static final String description = "opisanie class for rulers.";

}

public class Pen extends WritingMaterials {

public Pen() {

super("Pen", "Black");

}

}

public final class Divider extends WritingMaterials {

public Divider() {

super("Divider", "Pink");

}

//запрет переопределения метода

public final void drawCircle() {

System.out.println("круг нарисован");

}

}
