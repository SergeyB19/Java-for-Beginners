package lesson23.homework2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        System.out.println("Кол-во лап у собаки: " + dog.paw);
        Cat cat = new Cat("Cat");
        cat.sleep();
    }
}
