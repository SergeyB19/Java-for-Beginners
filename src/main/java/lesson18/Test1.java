package lesson18;

class Car {

}

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.charAt(4) = " + sb2.charAt(4));
        System.out.println("sb2.indexOf(\" \") = " + sb2.indexOf(" "));
        System.out.println("sb2.indexOf(\"o\") = " + sb2.indexOf("o"));
        System.out.println("sb2.indexOf(\"o\",2) = " + sb2.indexOf("o", 2));
        System.out.println("sb2.substring(5) = " + sb2.substring(5));
        System.out.println("sb2.substring(5,8) = " + sb2.substring(5, 8));
        System.out.println("sb2.subSequence(5,8) = " + sb2.subSequence(5, 8));
   /*     System.out.println("sb2.append(22) = " + sb2.append(22));
        System.out.println("sb2.append(true) = " + sb2.append(true));
        System.out.println("sb2.append(sb2) = " + sb2.append(sb2));
        System.out.println("sb2.append(\"Hello\") = " + sb2.append("Hello"));
        System.out.println("sb2.append(new Car()) = " + sb2.append(new Car()));*/
        System.out.println("sb2.insert(4, \"55\") = " + sb2.insert(4, "55"));
        System.out.println("sb2.insert(sb2.length(),\"Hello\") = " + sb2.insert(sb2.length(), "Hello"));
        System.out.println();
        StringBuilder sb10 = new StringBuilder("Hello World");
//        System.out.println("sb10.delete(3,6) = " + sb10.delete(3, 6));
        System.out.println("sb10.deleteCharAt(6) = " + sb10.deleteCharAt(6));
        System.out.println("sb10.reverse() = " + sb10.reverse());
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        System.out.println("sb12.replace(0,5,\"Pete\") = " + sb12.replace(0, 5, "Pete "));
        System.out.println("sb12.capacity() = " + sb12.capacity());
        System.out.println("sb1.capacity() = " + sb1.capacity());

    }
}
