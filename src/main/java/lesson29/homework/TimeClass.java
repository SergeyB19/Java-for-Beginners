package lesson29.homework;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeClass {
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm,dd/MMM/yy");

    public  void smena(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        LocalDateTime ldt = start;
        while (ldt.isBefore(end)) {
            System.out.println("Работаем с: " + ldt.format(formatter1));
            ldt = ldt.plus(period);
            System.out.println("До: " +  ldt.format(formatter1));
            System.out.println("Отдыхаем с: " +  ldt.format(formatter2));
            ldt = ldt.plus(duration);
            System.out.println("До: " +  ldt.format(formatter2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);
        TimeClass timeClass = new TimeClass();
        timeClass.smena(ldt1,ldt2,p,d);
    }
}
