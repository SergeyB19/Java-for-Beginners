package lesson6;

public class HomeWorkOverloadedMethods {
    int sum() {
        return 0;
    }

    int sum(int a) {
        return a;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}

class HomeWorkOverloadedMethodsTest {
    public static void main(String[] args) {
        HomeWorkOverloadedMethods hw = new HomeWorkOverloadedMethods();
        System.out.println(hw.sum());
        System.out.println(hw.sum(1));
        System.out.println(hw.sum(1 + 2));
        System.out.println(hw.sum(1 + 2 + 3));
        System.out.println(hw.sum(1 + 2 + 3 + 4));
    }
}
