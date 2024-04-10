package Lesson23;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);


        LocalDate specificDate = LocalDate.of(2017, Month.NOVEMBER, 30);
        LocalTime specificTime = LocalTime.of(16,30,50,234782);
        LocalDateTime specificDateTime = LocalDateTime.of(2017, Month.JULY, 9, 11, 6, 22);
        System.out.println(specificDate);
        System.out.println(specificDateTime);
        System.out.println(specificTime);

        LocalDate day140_2019 = LocalDate.ofYearDay(2019,140);
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now() );
        System.out.println(day140_2019);
        System.out.println(now);

        dateTime = LocalDateTime.ofEpochSecond(2523467474L,0, ZoneOffset.UTC);
        System.out.println(dateTime);


        LocalDate today = LocalDate.now();
        LocalDate custom = LocalDate.of(2025, 3, 2);
        System.out.println("год " + today.getYear() + " високосный? " + today.isLeapYear());
        System.out.println("Сегодня это до 02.03.2025 " + today.isBefore(custom));
        System.out.println("Текущее время: " + today.atTime(LocalTime.now()));

        System.out.println("Сегодня +9 дней " + today.plusDays(9));
        System.out.println("Сегодня +20 месяцев " + today.plusMonths(20));
        System.out.println("Сегодня -9 дней " + today.minusDays(9));
        System.out.println("Сегодня -20 месяцев " + today.minusMonths(20));
        System.out.println("Первый день месяца " + today.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Последний день года " + today.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println("Следующее воскресенье " + today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));
        System.out.println("Второй вторник месяца " + today.with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.TUESDAY)));

        LocalDate date1 = LocalDate.of(2023, 9, 18);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy G: EEEE").withLocale(new Locale(("ru")));
        String formattedDate = date1.format(formatter);
        System.out.println(formattedDate);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime1 = LocalDateTime.from(f1.parse("2012-01-10 23:16:26"));
        System.out.println(dateTime1);


        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy").withLocale(new Locale(("ru")));
        LocalDate localDate = LocalDate.from(f2.parse("января 20, 1986"));
        System.out.println(localDate);


    }
}
