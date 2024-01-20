package lesson21;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("poka");
        list.add(new String("poka"));
        list.add(new String("hello"));
        list.add(new String("ok"));
        list.add(String.valueOf(sb));
        list.add(new String("privet"));
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println(list.indexOf(new String("poka")));
        System.out.println(list.lastIndexOf(new String("poka")));
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"poka\") = " + list.contains("poka"));
        list.contains(sb);
        System.out.println("list.toString() = " + list.toString());
    }
}

