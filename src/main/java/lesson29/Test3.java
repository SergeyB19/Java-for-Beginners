package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        LocalDate ld2 = LocalDate.of(2012, Month.JUNE, 18);
        System.out.println("ld1.isAfter(ld2) = " + ld1.isAfter(ld2));
        System.out.println("ld1.isBefore(ld2) = " + ld1.isBefore(ld2));

        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(03, 5,18,55598);
        System.out.println("lt1.isBefore(lt2) = " + lt1.isBefore(lt2));
        System.out.println("lt1.isAfter(lt2) = " + lt1.isAfter(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,17,25);
        LocalDateTime ldt2 = LocalDateTime.of(2015,Month.SEPTEMBER,10,17,25,9);
        System.out.println("ldt1.isBefore(ldt2) = " + ldt1.isBefore(ldt2));
        System.out.println("ldt1.isAfter(ldt2) = " + ldt1.isAfter(ldt2));

    }
}
