package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfWeek());
        System.out.println("ld.getDayOfMonth() = " + ld.getDayOfMonth());
        System.out.println("ld.getDayOfYear() = " + ld.getDayOfYear());
        System.out.println("ld.getMonth() = " + ld.getMonth());
        System.out.println("ld.getMonthValue() = " + ld.getMonthValue());
        LocalTime lt = LocalTime.of(16, 40);
        System.out.println("lt.getNano() = " + lt.getNano());
        System.out.println("lt.getSecond() = " + lt.getSecond());
        System.out.println("lt.getHour() = " + lt.getHour());
        System.out.println();
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("ld = " + ld);
        System.out.println("ld.format(d1) = " + ld.format(d1));
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println("lt = " + lt);
        System.out.println("lt.format(d2) = " + lt.format(d2));
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("ldt = " + ldt);
        System.out.println("ldt.format(d3) = " + ldt.format(d3));
        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println("ld = " + ld);
        System.out.println("ld.format(d4) = " + ld.format(d4));

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("ld = " + ld);
        System.out.println("ld.format(shortFormat) = " + ld.format(shortFormat));
        System.out.println("ldt.format(shortFormat) = " + ldt.format(shortFormat));
        System.out.println("shortFormat.format(ldt) = " + shortFormat.format(ldt));
        System.out.println("d4.format(ld) = " + d4.format(ld));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, YYYY, hh:mm");
        System.out.println(ldt);
        System.out.println("ldt.format(formatter) = " + ldt.format(formatter));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015",f);
        System.out.println("date1 = " + date1);


    }
}
