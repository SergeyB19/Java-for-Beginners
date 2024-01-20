package lesson22;

public class Test3 {
    Test3() {
        System.out.println("Konstructor");
    }

    void Test3() {
        System.out.println("Object is created");
        System.out.println("Method");
    }

    //Test3 Test3
    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
