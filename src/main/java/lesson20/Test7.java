package lesson20;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
/*        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        for (int a : array) {
            a = 3;
            System.out.print(a);
        }*/

      /*  String[] array2 = {"privet", "poka", "ok"};
        for (String s : array2) {
            s = new String("hello");
        }*/
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array3 = {sb1, sb2, sb3};
        for (StringBuilder sb : array3) {
            sb.append("Java");
           /* sb = new StringBuilder("hello");
            System.out.println(sb);*/
        }

        for (int i = 0; i <array3.length ; i++) {
            System.out.print(array3[i]);
        }
        System.out.println(Arrays.toString(array3));
    }
}
