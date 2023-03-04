public abstract class Herbivores extends Animal{

    public Herbivores (String name){ // Конструктор делать абстрактным нельзя
        super(name);
    }
    @Override
    public String feed() {
        return "Grass";
    }
}
