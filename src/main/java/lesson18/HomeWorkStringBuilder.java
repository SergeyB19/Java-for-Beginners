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
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
