public class Leo extends Predator implements Runable, Swimable{
    private int runSpeed = 60;
    private int swimSpeed = 5;
    public Leo (String name){
        super(name);
    }

    @Override
    public String say() {
        return "Roar";
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
