package lesson30;

public class Test4 {
    static void def(Test5 t) {
        System.out.println(t.abc("privet","poka"));
    }

    public static void main(String[] args) {
        def((String x,String y)->x.length());

    }
}

interface Test5 {
    int abc(String s, String poka);
}
