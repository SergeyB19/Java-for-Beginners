package lesson15;

public class TimeClass {
    public static void main(String[] args) {
        timer();
    }

    public static void timer() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (hour > 1 && minuta % 10 == 0) {
                break OUTER;
                }
                int secunda = 0;
                while (secunda < 60) {
                    if (secunda * hour > minuta) {
                    continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuta + ":" + secunda);
                    secunda++;
                }
            } while (minuta < 59);
            hour++;
        }
    }
}

