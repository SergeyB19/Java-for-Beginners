package lesson21;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("hello"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("privet"));
        for (StringBuilder s : list) {
            System.out.println(s + "");
        }
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        for (StringBuilder s1 : list2) {
            System.out.println(s1 + "");
        }
        System.out.println("list2.get(1).append(\"!\") = " + list2.get(1).append("!"));
      /*  list.clear();
        for (StringBuilder s : list) {
            System.out.println(s + " ");
        }*/


    }
}
