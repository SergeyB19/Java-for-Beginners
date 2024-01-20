package lesson21;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        char[] array3 = {'p','r','i','v','e','t'};
        char[] array6 = {'p','r','i','v','e','t','o'};
        char[] array4 = {'p','r','i','v','i','v','k','a'};
        char[] array7 = null;
        char[] array8 = null;

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array2, array5));
        System.out.println(Arrays.compare(array3, array4));
        System.out.println(Arrays.compare(array3, array6));
        System.out.println(Arrays.compare(array3, array7));
        System.out.println(Arrays.compare(array7, array8));
        System.out.println();
        System.out.println(Arrays.mismatch(array2, array1));// индекс первого расхождения
        System.out.println(Arrays.mismatch(array3, array4));
    }
}
