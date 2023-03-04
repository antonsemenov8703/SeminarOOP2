import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Cow cow = new Cow("Мурка");  // Мы можем просто Animal писать, когда создаём новый экземпляр и не писать в
//        данном случае Сow
//          И добавлять мы можем сразу листом, так так прописали ниже:

        List<Animal> animalList= List.of(  // через =new ArrayList() - не получается сделать - надо через лист офф
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд"),
                new Beaver("Academeg")
        );
//        Zoo zoo = new Zoo();  // а Zoo мы пропишем в Zoo
        Zoo zoo = new Zoo(animalList, new Radio()); // и тут уже в конце добавляем new Radio


// Чтобы животное сказало слово, нужно перебрать foreach

//        for (Animal animal: zoo.getAnimalList()) {// вместо getAnimalList пропишем getSayable
//        и естественно вместо Animal пишем Sayable
        for (Sayable animal: zoo.getSayable()) {
            System.out.println(animal.say());
        }
// Теперь задача сделать так, чтобы было слышно что говорит радио в Zoo
// Добавляем реальный класс радио и сделаем интерфейс sayable - xо-то что может говорить

        for (Runable animal: zoo.getRunableList()) {
            System.out.println("------------------------");

            System.out.println(((Animal)(animal)).getName());
            System.out.println(animal.getSpeedRun());
            System.out.println(((Animal)(animal)).say()+"\n");

        }
        for (Flyable animal: zoo.getFlyableList()) {
            System.out.println("------------------------");
            System.out.println(((Animal) (animal)).getName());
            System.out.println(animal.getSpeedfly());
            System.out.println(animal.getHigh());
            System.out.println(((Animal) (animal)).say() + "\n");
        }
        for (Swimable animal : zoo.getSwimableList()) {
            System.out.println("------------------------");
            System.out.println(((Animal) (animal)).getName());
            System.out.println(animal.getSwimSpeed());
            System.out.println(((Animal) (animal)).say() + "\n");
        }
            System.out.println("---------определяем чемпиона по бегу---------------\n");
            System.out.println(zoo.getRunChampion());
            System.out.println("---------определяем чемпиона по полёту-------------\n");
            System.out.println(zoo.getFlightSpeedChampion()); // выводит белеберду - по этому в animal переделываем toString
            System.out.println("---------определяем чемпиона по плаванию-------------\n");
            System.out.println(zoo.getSwimSpeedChampion());
        }
    }
