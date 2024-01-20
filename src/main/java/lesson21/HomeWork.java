package lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {

    public static ArrayList<String> abc(String... s) {
        ArrayList<String> list = new ArrayList<>();
        for (String s1 : s) {
            if (!list.contains(s1)) {
                list.add(s1);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        abc("ok", "ok", "ok", "privet", "poka", "poka");
    }
}
