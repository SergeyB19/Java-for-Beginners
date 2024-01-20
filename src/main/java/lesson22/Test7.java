package lesson22;

public class Test7 {
    int a = 5;
    int l;
    int t,h=5, k;

    public void abc(int a, double b) {
        int c;
        c = 10;
        System.out.println("privet");
    }

    public void abc(double a, int b) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1.0, 2);

    }
}
