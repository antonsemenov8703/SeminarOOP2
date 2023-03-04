public class Cow extends Herbivores implements Flyable{
    private int flightSpeed = 150;
    private int flightHight = 500;
    public Cow (String name){
        super(name);
    }
    @Override
    public String say() {
        return "Moo";
    }

    @Override
    public int getSpeedfly() {
        return this.flightSpeed;
    }
    @Override
    public int getHigh() {
        return this.flightHight;
    }
}