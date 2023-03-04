public class Goat extends Herbivores implements Runable{

    private int runSpeed = 20;
    public Goat(String name){
        super(name);
    }

    @Override
    public String say() {
        return "Bee";
    }
    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
