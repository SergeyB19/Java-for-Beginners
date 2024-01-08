package lesson10hw.p4;

import lesson10hw.p1.A;
import lesson10hw.p1.p2.B;
import lesson10hw.p1.p2.p3.C;
import lesson10hw.p4.p5.E;
import lesson10hw.p4.p5.E.*;

import static lesson10hw.p1.p2.B.*;

public class D {

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        E e = new E();
        B b = new B();
        System.out.println(B.a);
        System.out.println(B.b);
        System.out.println(E.f);
        System.out.println(A.a);
        System.out.println(C.c);
    }

}
