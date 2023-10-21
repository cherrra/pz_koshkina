public class Bird extends Animal{
    String area;
    boolean winterFly;


    public Bird(){
    }
    public Bird(String name, String area, boolean winterFly){
        super(name);
        this.area = area;
        this.winterFly = winterFly;
    }
    public void chiriсk_chiriсk(){
        System.out.println("Chiriсk-Chiriсk");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    @Override
    public void display() {
        System.out.println("I am a " + "Bird");
    }
}
