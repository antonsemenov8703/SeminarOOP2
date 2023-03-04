public class Crocodile extends Predator implements Runable, Flyable, Swimable{
    private int runSpeed = 10;
    private int flightSpeed = 15;
    private int flightHight = 5;
    private int swimSpeed = 40;
    public Crocodile (String name){
        super(name);
    }

    @Override
    public String say() {
        return "mute";
    }
    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
    @Override
    public int getSpeedfly() {
        return this.flightSpeed;
    }
    @Override
    public int getHigh() {
        return this.flightHight;
    }
    @Override
    public int getSwimSpeed() {
        return this.swimSpeed;
    }
}
