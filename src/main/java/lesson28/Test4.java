package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    void abc() throws FileNotFoundException{
    /*    File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);*/
        int[] array = {1, 2};
        System.out.println(array[5]);
        System.out.println("Vsem horoshego dnya");

    }


    void def() throws FileNotFoundException {
        abc();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        try {
            t.def();
        } catch (FileNotFoundException e) {
            System.out.println("Bil poyman exception: " + e);
            e.getMessage();
//            e.printStackTrace();
        }

//        File f = new File("test8.txt");

     /*   try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem horoshego dnya");
        } catch (FileNotFoundException e) {
            System.out.println("Bil poyman exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Bil poyman exception: " + e);
        } finally {
            System.out.println("eto finally block");
        }*/

//        System.out.println("Danniy kod uze ne imeet otnosheniya k isklucneniyam");
    }
}

