package lesson23.homework2;

public class Pet extends Animal{
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Pets run");
    }
    public void jump() {
        System.out.println("Pets jumps");
    }
}
