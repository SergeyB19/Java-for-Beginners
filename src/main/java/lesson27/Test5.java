package lesson27;

public class Test5 {

    {
        System.out.println("Eto init block 3");
    }
    Test5() {
        System.out.println("Eto constructor 1");
    }

    Test5(int a) {
        System.out.println("Eto constructor 2");
        System.out.println("Eto constructor 1");
    }
    String s1;

    {
        s1 = "ok";
        System.out.println("Hello");
        int a = 5;
        System.out.println(a);
        System.out.println("Eto init block 1");
    }

    static  {
        System.out.println("Eto STATIC init block");
    }

    {
        System.out.println("Eto init block 2");
    }

    static  {
        System.out.println("Eto STATIC init block 2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);
    }
}
