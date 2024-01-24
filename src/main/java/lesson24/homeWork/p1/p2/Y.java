package lesson24.homeWork.p1.p2;

import lesson24.homeWork.p1.X;

public class Y extends X {
    public void abc() {
        System.out.println("Y");
    }
    public void def() {
        Y y = new Y();
        y.abc();
    }

    public void ghi() {
        X x = new Y();
        x.abc();
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}
