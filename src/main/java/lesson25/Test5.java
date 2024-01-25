package lesson25;

public class Test5 {

}

interface I1 {
    default void abc() {
        System.out.println("eto method abc");
    }

    default void ghi() {
        System.out.println("eto method ghi");
    }

   /* default void def() {
        System.out.println("eto method def");
    }*/

    static void def() {
        System.out.println("static method");
    }
}

interface I2 extends I1 {
    @Override
    default void abc() {
        I1.super.abc();
    }
}

abstract class R implements I1 {
    @Override
    public void abc() {
        I1.super.abc();
    }
}

abstract class O {

}

class R2 extends O implements I1 {
   static R2 method1(I2 i) {
        return new R2();
    }

    public static void main(String[] args) {
        I2 i = new D2();
        method1(i);
    }
}

class D2 implements I2 {

}

/*
class Z2 implements I1 {
    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
    }
    @Override
    public void abc() {
        System.out.println("eto method abc");
    }
}
*/
