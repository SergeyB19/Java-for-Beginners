package lesson17;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "privet";
        System.out.println("s1.isBlank() = " + s1.isBlank());
        String s2 = "     ";
        System.out.println("s2.isBlank() = " + s2.isBlank());
        String s3 = "";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());
        System.out.println();
        String s4 = "     privet     ";
        System.out.println("s4.trim() = " + s4.trim());
        System.out.println("s4.strip() = " + s4.strip());
        System.out.println("s4.stripLeading() = " + s4.stripLeading());
        System.out.println("s4.stripTrailing() = " + s4.stripTrailing());
        String s5 = "poka";
        System.out.println("s5.strip() = " + s5.strip());

    }
}
