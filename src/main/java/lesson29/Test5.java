package lesson29;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalTime lt = LocalTime.of(10, 30);
        Period p = Period.ofDays(10);
        Period p1 = Period.ofMonths(3).ofDays(10);
        Period p2 = Period.ofMonths(3);
        p = Period.ofDays(10);
        System.out.println(nachalo.plus(p));
        System.out.println(nachalo.plus(p1));

        Duration d = Duration.ofDays(2);
        Duration d1 = Duration.ofHours(3);
        Duration d2 = Duration.ofMinutes(3);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);

    }
}
