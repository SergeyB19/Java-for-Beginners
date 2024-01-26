package lesson27;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        Long l = 50l;
        int a = list.get(0);
        System.out.println(a);
       /* Number b = new Integer(10);
        int c = (Integer) b;
        switch (b) {
        }*/
        String s1 = " 50";
        int i1 = Integer.parseInt(s1.trim());
        System.out.println("i1 = " + i1);
        String s2 = "true";
        String s3 = "3.14";
        double d = Double.parseDouble(s3);
        System.out.println("s3 = " + s3);
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println("b1 = " + b1);

        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);
        double d2 = Double.valueOf(s3);
        System.out.println(d2);


    }
}
