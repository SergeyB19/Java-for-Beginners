package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman i  nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finally");
        }

    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman i  polnostuy obrabotan");
        }
    }

/*    void def() {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception poiman i  nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finally");
        }
    }*/
}
