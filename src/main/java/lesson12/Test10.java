package lesson12;

import lesson9.Test1;

public class Test10 {

    void abc() {
        String str;
        int a = 10;
        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            int a = 5;
            System.out.println("Maximum - " + i1);
        } else if (i2 > 1 && i2 > i3) {
            int a = 10;
            System.out.println("Maximum - " + i2);
        } else {
            int a = 15;
            System.out.println("Maximum " + i3);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int maximum = (a > b) ? a : b;
        System.out.println(maximum);

        Test10 t = new Test10();
        t.maximum(4, 7, 0);
//        int salary = 600;

//
//        if (salary>=500) {
//            System.out.println(":)");
//            System.out.println("!!!!!!!!!!!");
//        } else {
//            System.out.println(":(");
//        }
//        System.out.println("Vse budet horosho!");

//        int salary = 1500;
//
//        if (salary < 200) {
//            System.out.println("Z/P ochen nizka");
//        } else if (salary < 400) {
//            System.out.println("Z/P srednego razmera");
//        } else if (salary < 600) {
//            System.out.println("Z/P visokaya");
//        } else {
//            System.out.println("Z/P otlichnaya");
//        }


    }
}
