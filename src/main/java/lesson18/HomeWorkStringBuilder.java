package lesson18;

public class HomeWorkStringBuilder {
    public static void main(String[] args) {
        HomeWorkStringBuilder homeWorkStringBuilder = new HomeWorkStringBuilder();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = sb2;
        System.out.println(homeWorkStringBuilder.ravenstvo(sb1, sb2));
    }

    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.equals(sb2)) {
            return true;
        } else
            return false;
    }
}
