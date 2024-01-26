package lesson26.homework;

import lesson25.homework.*;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Karl_1");
        Animal a2 = new Pingvin("Kovalski_1");
        Animal a3 = new Lev("Leva_1");
        Fish f1 = new Mechenosec("Karl_2");
        Bird b1 = new Pingvin("Kovalski_2");
        Mammal m1 = new Lev("Leva_2");
        Mechenosec mech1 = new Mechenosec("Karl_3");
        Pingvin p1 = new Pingvin("Kovalski_3");
        Lev l1 = new Lev("Leva_3");
        Speakable s1 = new Pingvin("Kovalski_4");
        Speakable s2 = new Lev("Leva_4");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("------------------------------------------");
        }
        for (Speakable s : array2) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("---------------------------------");
        }
    }
}