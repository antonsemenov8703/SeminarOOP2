public class Radio implements Sayable { // сделали имплементацию метода say()
    // чтобы он не горел красненьким, то надо сразу что-то прописать, что он говорит, для этого переназначает say()

    @Override
    public String say() {
        return "Bla bla bla";
    // а теперь в классе Animal и там тоже прописываем implements sayable
    }
}
