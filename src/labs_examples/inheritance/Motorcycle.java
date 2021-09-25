package labs_examples.inheritance;

public class Motorcycle extends Vehicle{

    private int cc;
    private boolean twoSeat;

    public Motorcycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }

    public void demonstrateThisSuper(){
        this.accelerate(20);
        super.accelerate(30);
    }

    @Override
    public boolean start() {
        System.out.println("Start motorcycle");
        return true;
    }

    @Override
    public void accelerate(int mph){
        System.out.println("Motorcycle accelerating " + mph + " mph");
        //steps to accelerate motorcycle
    }

}
