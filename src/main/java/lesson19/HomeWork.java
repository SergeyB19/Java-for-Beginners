package lesson19;

import java.util.Arrays;

public class HomeWork {
/*    public static void sortirovka(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }*/

    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

 /*   public static void showArray(String[][] twoArray) {
        for (int i = 0; i < twoArray.length; i++) {

            System.out.print("{"+ Arrays.toString(twoArray[i])+"}");
        }
    }*/
 public static void showArray(String[][] array) {
     System.out.print("{ ");
     for (int i = 0; i < array.length; i++) {
         System.out.print("{");
         for (int j = 0; j < array[i].length; j++) {
             if (j != array[i].length - 1) {
                 System.out.print(array[i][j] + ", ");
             } else {
                 System.out.print(array[i][j]);
             }
         }
         if (i != array.length - 1) {
             System.out.print("}, ");
         } else {
             System.out.print("}");
         }
     }
     System.out.println(" }");
 }

    public static void main(String[] args) {
        int[] array = {-2,1,5,3,0,9,4,6,7,90};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        String[][] array2 = {{"privet", "kak dela"}, {"normalno,horosho"}, {"chem zanyat, kushaesh?"}};
        String[][] array1 = {{"apple", "orange"}, {"hello","bye","ok"}, {"car"}};
        String[][] array3 = {{"man", "woman"}, {"male","female"}};
        showArray(array2);
        System.out.println();
        showArray(array1);
        System.out.println();
        showArray(array3);
    }
}
