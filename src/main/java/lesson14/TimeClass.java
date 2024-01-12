package lesson14;

public class TimeClass {
    public static void main(String[] args) {
        timer();
    }

    public static void timer() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MIDDLE:
            for (int minuta = 0; minuta < 60; minuta++) {
                if (hour > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int secunda = 0; secunda < 60; secunda++) {
                    if (secunda * hour > minuta) {
                    continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuta + ":" + secunda);
                }

            }
        }
    }
}

