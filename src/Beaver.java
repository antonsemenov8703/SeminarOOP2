public class Beaver extends Herbivores implements Runable, Swimable{
    private int swimSpeed = 20;
    private int runSpeed = 10;
    public Beaver(String name){
        super(name);
    }
    @Override
    public String say() {

        return "AAAaaaaa!";
    }
    @Override
    public int getSwimSpeed() {
        return this.swimSpeed;
    }
    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
