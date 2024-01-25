package lesson25.homework;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
