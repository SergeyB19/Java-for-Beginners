package lesson27;

public class Test6 {
    int a = 3;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

  /*  public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.a);
    }*/
}

class A {
    static final int b;

    static {
        b = 10;
    }

    A() {
    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 5;
        d = 3;
//        e = 2;
        f = 0;
    }

}

class C {
    String s = "ok";

    {
        System.out.println(s);

    }

    static int i = 0;

    {
        System.out.println(i);
    }

    /*static*/ {
        i = i + 1;
        System.out.println(i);
    }

    C() {
        System.out.println("Eto konstructor");
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println("Privet vsem");
    }
}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    public D() {
        abc(5);
    }
    static {
        abc(4);
    }
    {
        abc(6);
    }
    static {
        new D();
    }
    {
        abc(8);
    }

    public static void main(String[] args) {

    }
}
