package lesson25.homework;

public abstract class Animal {
    public Animal(String name) {
        this.name = name;
    }

    public String name;
    abstract void eat();
    abstract void sleep();

}
