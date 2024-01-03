package com.zaurtregulov.lesson3;

public class HomeWork {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        int a = 5;
        int i = a-- - --a + ++a + a++ + a;//5-3+4+4+5=15
        System.out.println(i);
        int b = 8;
        int i3 = ++b - b++ + ++b - --b;//9-9+10-9=1
        System.out.println(i3);

    }
}
