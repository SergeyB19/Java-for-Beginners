package lesson25.homework;

public class Pingvin extends Bird implements Speakable{
    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }

    @Override
   public void fly() {
        System.out.println("Pingvini ne umeut letat!");
    }

    @Override
   public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
   public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
}
