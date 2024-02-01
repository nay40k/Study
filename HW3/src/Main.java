public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void main(String[] args) {

        System.out.println(ANSI_YELLOW + "=========================================================================================");
        System.out.println("=================== Домашнее задание #3 26.01 Операторы if/switch =======================");
        System.out.println("=========================================================================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "#3.1 Напишите программу, которая будет переводить секунды в форматированный вид" + ANSI_RESET);

        int inputSeconds = (int) (Math.random() * 2500000 + 1);

        System.out.println("Введено секунд: " + inputSeconds);
        int outputWeeks = inputSeconds / 604800;
        inputSeconds %= 604800;
        int outputDays = inputSeconds / 86400;
        inputSeconds %= 86400;
        int outputHours = inputSeconds / 3600;
        inputSeconds %= 3600;
        int outputMinutes = inputSeconds / 60;
        inputSeconds %= 60;
        int outputSeconds = inputSeconds;

        String result = "";
        String weeksString = "";
        if (outputWeeks != 0) {
            switch (outputWeeks % 10) {
                case 1 -> weeksString = " неделя ";
                case 2, 3, 4 -> weeksString = " недели ";
                default -> weeksString = " недель ";
            }
            result += (outputWeeks + weeksString);
        }

        String daysString = "";
        if (outputDays != 0) {
            switch (outputDays) {
                case 1 -> daysString = " день ";
                case 2, 3, 4 -> daysString = " дня ";
                default -> daysString = " дней ";
            }
            result += (outputDays + daysString);
        }

        String hoursString = "";
        if (outputHours != 0) {
            switch (outputHours) {
                case 1, 21 -> hoursString = " час ";
                case 2, 3, 4, 22, 23 -> hoursString = " часа ";
                default -> hoursString = " часов ";
            }
            result += (outputHours + hoursString);
        }

        if (outputMinutes != 0) {
            String minutesString = "";
            if (outputMinutes % 100 >= 11 && outputMinutes % 100 <= 14) {
                minutesString = " минут ";
            } else {
                switch (outputMinutes % 10) {
                    case 1 -> minutesString = " минута ";
                    case 2, 3, 4 -> minutesString = " минуты ";
                    default -> minutesString = " минут ";
                }
            }
            result += (outputMinutes + minutesString);
        }

        if (outputSeconds != 0) {
            String secondsString = "";
            if (outputSeconds % 100 >= 11 && outputSeconds % 100 <= 14) {
                secondsString = " секунд ";
            } else {
                switch (outputSeconds % 10) {
                    case 1 -> secondsString = " секунда ";
                    case 2, 3, 4 -> secondsString = " секунды ";
                    default -> secondsString = " секунд ";
                }
            }
            result += (outputSeconds + secondsString);
        }
        System.out.println(result);

        System.out.println(ANSI_GREEN + "#3.2 Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год" + ANSI_RESET);
        int day = 28;
        int month = 2;
        int year = 2000;
        String nextDate = "";
        int daysInMonth = 0;
        boolean leapYear = false;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            leapYear = true;
        }
        int temp = 0;
        if (leapYear) {
            temp = 29;
        } else {
            temp = 28;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
            case 2 -> daysInMonth = (temp);
            default -> daysInMonth = 30;
        }
        if (day > daysInMonth || month > 12) {
            System.out.println(ANSI_RED + "Введённые числа некорректны" + ANSI_RESET);
        } else if (day < daysInMonth) {
            nextDate = (day + 1) + " " + month + " " + year;
            System.out.println("Результат: " + nextDate);
        } else if (day == daysInMonth) {
            nextDate = "1 " + (month + 1) + " " + year;
            System.out.println("Результат: " + nextDate);
        } else if (day == daysInMonth && month == 12) {
            nextDate = "1 " + "1 " + (year + 1);
            System.out.println("Результат: " + nextDate);
        }

        System.out.println(ANSI_GREEN + "#3.3 Оптимизация тайм-менеджмента от инженера Петрова" + ANSI_RESET);
        int n = (int) (Math.random() * 28800 + 1);
        System.out.println(n);

        if ((n / 3600) == 1) {
            System.out.println("Остался " + (n / 3600) + " час");
        } else if (((n / 3600) == 2) || ((n / 3600) == 3) || ((n / 3600) == 4)) {
            System.out.println("Осталось " + (n / 3600) + " часа");
        } else if (((n / 3600) == 5) || ((n / 3600) == 6) || ((n / 3600) == 7)) {
            System.out.println("Осталось " + (n / 3600) + " часов");
        } else {
            System.out.println("Осталось менее часа");
        }

        System.out.println(ANSI_GREEN + "#3.4 Найти среднее число из трех, введенных с клавиатуры (не среднее арифметическое)" + ANSI_RESET);
        int a = 13;
        int b = 12;
        int c = 11;
        int median = (a > b) ? ((c < b) ? b : ((c < a) ? c : a)) : ((a > c) ? a : (b > c) ? c : b);
        System.out.println(median);
    }
}