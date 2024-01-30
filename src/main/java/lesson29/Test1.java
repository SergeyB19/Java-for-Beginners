package lesson29;

import java.time.*;
public class Test1 {
    public static void main(String[] args) {
     /*   System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());*/

        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2014, Month.MAY, 15);
        System.out.println(ld2);
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15, 30,45);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(15, 30,45,9999_99999);
        System.out.println(lt3);
        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,17,25);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2015,9,10,17,25,18);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(2015,Month.JANUARY,10,17,25,18,5896);
        System.out.println(ldt3);
        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt4);
        System.out.println();
        System.out.println("ld1.plusDays(5) = " + ld1.plusDays(5));
        System.out.println("ld1.minusDays(17) = " + ld1.minusDays(17));
        System.out.println("ld1.plusWeeks(3) = " + ld1.plusWeeks(3));
        System.out.println("ld1.minusDays(2) = " + ld1.minusDays(2));
        System.out.println("ld1.plusMonths(2) = " + ld1.plusMonths(2));
        System.out.println("ld1.minusMonths(3) = " + ld1.minusMonths(3));
        System.out.println("ld1.plusYears(3) = " + ld1.plusYears(3));
        System.out.println("ld1.minusYears(3) = " + ld1.minusYears(3));
        System.out.println("Methods LocalTime");
        System.out.println("lt1.plusHours(1) = " + lt1.plusHours(1));
        System.out.println("lt1.minusMinutes(10) = " + lt1.minusMinutes(10));
        System.out.println("lt1.plusSeconds(18) = " + lt1.plusSeconds(18));
        System.out.println("lt1.minusNanos(5) = " + lt1.minusNanos(5));
        System.out.println("Methods LocalDateTime");
        System.out.println("ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(30) = " + (ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(3).minusSeconds(30)));



    }
}
