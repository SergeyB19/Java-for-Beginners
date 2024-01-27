package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Poyman exception 1 " + e);
        } catch (NullPointerException e) {
            System.out.println("Poyman exception 2" + e);
        } catch (IOException e) {
            System.out.println("Poyman exception 3" + e);
        } catch (RuntimeException e) {
            System.out.println("Poyman exception 4" + e);
        } catch (Exception e) {
            System.out.println("Poyman exception 5" + e);
        } catch (Throwable e) {
            System.out.println("Poyman exception 6" + e);
        }
    }
}
