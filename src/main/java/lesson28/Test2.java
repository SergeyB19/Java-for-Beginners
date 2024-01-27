package lesson28;

import java.io.FileNotFoundException;

public class Test2 {
    void abc() throws ArrayIndexOutOfBoundsException {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) throws FileNotFoundException {

        int array[] = {1, 4, 0};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
            System.out.println("isklyuchenie poymano");
        } finally {
        }
//        System.out.println(array[5]);
//        System.out.println("hello");
    }
}
