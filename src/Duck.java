public class Duck extends Herbivores implements Flyable, Runable, Swimable{

    private int flightSpeed = 15;
    private int flightHight = 5;
    private int runSpeed = 10;
    private int swimSpeed = 10;
    public Duck(String name){
        super(name);
    }
    @Override
    public String say() {
        return "Кря";
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
    public int getSpeedRun() {
        return this.runSpeed;
    }
    @Override
    public int getSwimSpeed() {
        return this.swimSpeed;
    }
}
