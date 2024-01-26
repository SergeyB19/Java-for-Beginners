package lesson26;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
//        System.out.println(7);
        int i1 = 3;
        short s2 = (short) i1;
        byte b2 = 3;
        short s1 = -1;
        char c1 = 100;
        long l1 = 1;
        int i2 = (int) l1;

        int i10 = 111111;
        short s10 = (short) i10;
//        System.out.println(s10);

        char c10 = (char) -8;
        System.out.println(c10);
        int i12 = (int) 3.14;
        System.out.println(i12);
        double d = 58974568.563;
        byte b12 = (byte) d;
        System.out.println(b12);

        int i = 2147483647;
        System.out.println(i + 1);

        int in = 5;
        long l = 10;
        System.out.println(in + l);
        i = (int) (i * l);
        System.out.println(i);

        float f = 3.14f;
        int ii2 = 10;
        System.out.println(f + ii2);

        byte b1 = 3;
        short s = 4;
        char c = 5;
        System.out.println(b1 + s + c);

        byte b3 = 10;
        float f2 = 7;
        double d2 = 2.0;
        System.out.println(b3 + f2 - d2);

        double d10 = 3.14;
        float f10 = 6.28f;

        float f11 = 0 * 1.5f;
        float f12 = (float) (0 * 1.5);


    }
}
