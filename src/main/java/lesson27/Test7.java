package lesson27;

public class Test7 {

}

class Animal {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("____________________");
        Lion l = new Lion();
    }
    public Animal() {
        System.out.println("Konstructor of Animal");
    }

    static {
        System.out.println("Static init in Animal");
    }
    {
        System.out.println("non-static in Animal");
    }
}

class Mammal extends Animal {
    public Mammal() {
        System.out.println("Konstructor of Mammal");
    }
    static {
        System.out.println("Static init in Mammal");
    }
    {
        System.out.println("non-static in Mammal");
    }
}

class Lion extends Mammal {
    public Lion() {
        System.out.println("Konstructor of Lion");
    }
    static {
        System.out.println("Static init in Lion");
    }
    {
        System.out.println("non-static in Lion");
    }
}
