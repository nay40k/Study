//Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
//        Пример: “JANUARY 1 2000” => true  “JANUARY 2 2020” => false

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateOddChecker {

    public static boolean isDateOdd(String date) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.US);
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(dateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        return dayOfYear % 2 != 0;
    }

    public static void main(String[] args) {
        String testString1 = "JANUARY 1 2000";
        String testString2 = "MARCH 1 2023";
        String testString3 = "MARCH 1 2024";
        String testString4 = "JANUARY 20 1986";

        System.out.println(testString1 + " => " + isDateOdd(testString1)); // JANUARY 1 2000 => true
        System.out.println(testString2 + " => " + isDateOdd(testString2)); // MARCH 1 2023 => false
        System.out.println(testString3 + " => " + isDateOdd(testString3)); // MARCH 1 2024 => true
        System.out.println(testString4 + " => " + isDateOdd(testString4)); // JANUARY 20 1986 => false
    }
}
