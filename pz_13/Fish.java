public class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

    public Fish(){
    }
    public Fish(String name, String squama, boolean upStreamSwim){
        super(name);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }
    public void bul_bul(){
        System.out.println("Bul-Bul");
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }
    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    @Override
    public void display() {
        System.out.println("I am a " + "Fish");
    }
}
