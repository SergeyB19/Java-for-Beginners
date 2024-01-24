package lesson24;

public class A10 {
    String s1 = "privet";
    static double d1 = 3.14;

    int summa(int... ints) {
        int result = 0;
        for (int a : ints) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends A10 {
    //    String s2 = super.s1 + ", drug!";
    double d1 = super.d1;
    String s1 = super.s1;
//    boolean s1 = true;

    int summa(int... ints) {
        int result = super.summa(ints);
        System.out.println("Summa: " + result);
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}
