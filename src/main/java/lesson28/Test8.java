package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(abc());
    }

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("hello");
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
//            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman");
            System.out.println("Peremennaya a v catch blocke = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("eto block finally");
            System.out.println("Peremennaya a v finally blocke = " + a);
//            return 7;
        }
        return a;
    }
}
