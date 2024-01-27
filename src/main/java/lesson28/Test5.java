package lesson28;

public class Test5 {
    static void abc() {
        System.out.println("rabotaet method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println("Error poyman " + e);
        }
    }
}
