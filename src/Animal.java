public abstract class Animal implements Sayable{

    private String name;

    protected Animal(String name){ // конструктор для задания имени
        this.name = name;       // сделали protected, чтобы
        // "защититься", но у нас и так абстрактный класс Animal
        // и сейчас мы не сможем создать в main с помощью конструктора (new...)
    }

//    public abstract String say(); // 1. Делаем say абстрактным классом - мы не знаем как кто будет говорить.
// А теперь убираем этот метод say, т.к. мы уже имплементировали этот метод из sayable.
//  А в Zoo cейчас сделаем метод, который будет возвращать тех, что разговаривает

    public String getName(){
        return this.name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (this instanceof Runable) {// this - тут это означает - созданный объект этого класса
            str.append(" скорость бега " + ((Runable)this).getSpeedRun());
        }
        if (this instanceof Flyable) {// this - тут это означает - созданный объект этого класса
            str.append(" скорость полёта " + ((Flyable)this).getSpeedfly());
        }
        if (this instanceof Swimable) {// this - тут это означает - созданный объект этого класса
            str.append(" скорость полёта " + ((Swimable)this).getSwimSpeed());
        }
            return String.format(str + " %s ест %s  ", this.name, this.feed());
    }
}
