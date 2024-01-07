package lesson9;

public class HomeWork {
    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

    public static void main(String[] args) {
        lesson9.HomeWork hw = new HomeWork();
        abc();
        abc();
        String s1 = new String("ABC");
        abc();
    }
}
