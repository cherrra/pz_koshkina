public class Insect extends Animal{
    int wingCount;
    boolean likeJesus;

    public Insect(){
    }
    public Insect(String name, int wingCount, boolean likeJesus){

        super(name);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
    }
    public void ggggg(){
        System.out.println("Ggggg");
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    @Override
    public void display() {
        System.out.println("I am a " + "Insect");
    }
}
