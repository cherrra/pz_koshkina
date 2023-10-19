public class Animal {
   private String type;
   private String name;
   private int age;
   private double weight;
   private boolean isFly;
   private boolean isWalk;
   private boolean isSwim;

//методы
    public void display(){
        System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + ", " +
                "Умеет летать: " + isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim);
    }

    public void rename(String name){
        this.name = name;

    }

    public void holiday(int days){
        weight += 0.1*days;

    }


//конструкторы
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
        this.isFly = false;
        this.isWalk = false;
        this.isSwim = false;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No Name";
        this.age = age;
        this.weight = 0.0;
        this.isFly = false;
        this.isWalk = false;
        this.isSwim = false;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }


//инкапсуляция
    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setSwim(boolean isSwim){
        this.isSwim = isSwim;
    }

    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }

    public void setFly(boolean isFly){
        this.isFly = isFly;
    }

    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean getSwim(){
        return this.isSwim;
    }

    public boolean getWalk(){
        return this.isWalk;
    }

    public boolean getFly(){
        return this.isFly;
    }

}

