package lesson28;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
      /*  Animal2 a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            System.out.println("Exception poyman");
        } finally {
            System.out.println("eto finally block");
        }*/
    }
}

class Animal2 {
    public Animal2() throws FileNotFoundException, IndexOutOfBoundsException {
    }
    /* void run() throws IOException, ArrayIndexOutOfBoundsException {
        System.out.println("Animal runs");
    }*/
}

class Mouse extends Animal2 {
    Mouse() throws Exception,IOException, ArrayIndexOutOfBoundsException {
        super();

    }
   /* void run() throws ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println("Mouse runs");
    }*/
}

class Human {
    String name;
    int age;

    public Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("nekorrektniy vozrast");
        }
        this.name = name;
        this.age = age;
    }
}
