package lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s1.charAt(3) = " + s1.charAt(3));
        System.out.println("s1.indexOf('t') = " + s1.indexOf('t'));
        System.out.println("s1.indexOf(\"t\") = " + s1.indexOf("t"));
        System.out.println("s1.indexOf(\"vet\") = " + s1.indexOf("vet"));
        System.out.println("s2.indexOf(\"a\") = " + s2.indexOf("a"));
        System.out.println("s2.indexOf(\"a\",5) = " + s2.indexOf("a", 5));
        System.out.println("s2.indexOf('a',5) = " + s2.indexOf('a', 5));
        System.out.println();
        System.out.println("s2.startsWith(\"abc\") = " + s2.startsWith("abc"));
        System.out.println("s2.startsWith(\"abc\",7) = " + s2.startsWith("abc", 7));
        System.out.println("s2.endsWith(\"abc\") = " + s2.endsWith("abc"));
        System.out.println("s2.endsWith(\"cd\") = " + s2.endsWith("cd"));
        System.out.println();


    }
}
