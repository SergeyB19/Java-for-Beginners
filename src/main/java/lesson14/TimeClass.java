package lesson14;

public class TimeClass {
    public static void main(String[] args) {
        timer();
    }

    public static void timer() {
        for (int hour = 0; hour <=6 ; hour++) {
            for (int minuta = 0; minuta < 60; minuta++) {
                for (int secunda = 0; secunda < 60; secunda++) {
                    if (hour > 1 && minuta % 10 == 0) {
                        break;
                    }
                    if (secunda * hour > minuta) {
                        continue;
                    }
                    System.out.println(hour + ":" + minuta + ":" + secunda);
                }
            }
        }
    }
}
