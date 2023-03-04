import java.util.ArrayList;
import java.util.List;

public class Zoo {


    List<Animal> animalList = new ArrayList<>();

    // Чтобы сделать добавление радио не просто где-то добавив его в список при выводе, а более гармонично,
    // то пропишем новый объект тут в Zoo:
    Sayable radio; // Просто ";" - в конструкторе мы будем добавлять ещё и радио

    public Zoo(List<Animal> animals, Sayable sayableObj) { // это тут мы не ArrayList пишем, а List - т.к. List - это абстракция,
        // а ArrayList - это реализация List'а
        // вот тут добавляем радио как ещё один sayable объект- добавляем в парамметр
        this.radio = sayableObj; // и приравниваем this.radio к этому парамметру.
        animalList.addAll(animals);
    }

    public void addAnimal(Animal animal) { // создаём метод для добавления животных, и для этого мы выше
        // создали list типа Animal
        animalList.add(animal);
    }

    public void addAnimal(List<Animal> animals) { // создаём метод, чтобы сразу листом добавлять животных
        // мы можем с таким же именем это делать т.к. это "перегрузка" Это как мы делали метод для 2, 1 и без аргументов
        animalList.addAll(animals); // автоматически предложил нам addAll метод (??? почему ???) Это получается
        // метод для добавления всего массива(листа)
    }

    public List<Animal> getAnimalList() { // сделали геттер от animalList
        return animalList;
    }

    //    public List<Animal> // только мы не Animal берём, а sayable
    public List<Sayable> getSayable() {
// прям в методе sayable создаём список говорящих
        List<Sayable> sayableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            sayableList.add(animal); // сам aminal имеет "instanse of" и нам его не нужно никуда "кастовать".
        }
//        sayableList.add(new Radio()); //за циклом добавляем в список радио
        // Radio добавили коряво, но пока так для примера
        // и опять меняем запись - new Radio на this.radio, т.к мы его прописали уже выше
        sayableList.add(this.radio);
        return sayableList;
    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) { // тут проверили, что этих животных можно привести к Runable
                runableList.add((Runable) animal); // а тут приводим их к Runable
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }
    public List<Swimable> getSwimableList() {
        List<Swimable> swimableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Swimable) {
                swimableList.add((Swimable) animal);
            }
        }
        return swimableList;
    }

    public Animal getRunChampion() { // проговариваем - "вернём Animal"
        List <Runable> runners = getRunableList();
//        int maxSpeed = runners.get(0).getSpeedRun(); // это убираем, чтобы ориентироваться не на maxSpeed а на ChampionSpeed
//        Animal champion = (Animal) runners.get(0); // переменная типа Animal, чтобы сохранять название животного чемпиона
        // Чтобы постоянно не кастовать - переделаем строку выше:
        Runable champion = runners.get(0);
        for (Runable r: runners) {
            if (champion.getSpeedRun() < r.getSpeedRun()){
//            if (maxSpeed < r.getSpeedRun()){
//                maxSpeed = r.getSpeedRun();
//                champion = (Animal)r;
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlightSpeedChampion() {
        List <Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable f: flyers) {
            if (champion.getSpeedfly() < f.getSpeedfly()){
                champion = f;
            }
        }
        return (Animal) champion;
    }
    public Animal getSwimSpeedChampion() {
        List <Swimable> swimmers = getSwimableList();
        Swimable champion = swimmers.get(0);
        for (Swimable s: swimmers) {
            if (champion.getSwimSpeed() < s.getSwimSpeed()){
                champion = s;
            }
        }
        return (Animal) champion;
    }
}


