public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isSwim;
    private boolean isWalk;
    private boolean isFly;

    public Animal(String type) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Animal(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    public Animal() {
    }


    public void display() {
        System.out.printf("Тип: %s \tИмя: %s \tВозраст: %s \tВес: %s \tУмеет летать: %s \tУмеет ходить: %s \tУмеет плавать: %s\n", type, name, age, weight, isSwim, isWalk, isFly);
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public void holiday() {
    }

    public void holiday(int count) {
        double plusweight = 0.1;
        weight += (plusweight * count);
    }

    public void holiday(double m) {
        weight += m;
    }

    public void holiday(double m, int n) {
        weight += n * m;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }
}
