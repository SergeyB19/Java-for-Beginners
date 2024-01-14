package lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        String s2 = new String("privet");
        System.out.println("s1.substring(3) = " + s1.substring(3));
        System.out.println("s1.substring(3,7) = " + s1.substring(3, 7));
        System.out.println("s1.substring(3,11) = " + s1.substring(3, 11));
        System.out.println();
        System.out.println("s1.trim() наружние пробелы off = " + s1.trim());
        System.out.println();
        System.out.println("s2.replace('r','Z') = " + s2.replace('r', 'Z'));
        System.out.println("s2.replace(\"vet\",\"vivka\") = " + s2.replace("vet", "vivka"));
        System.out.println();
        System.out.println("s1.concat(s2) = " + s1.concat(s2));



    }
}
