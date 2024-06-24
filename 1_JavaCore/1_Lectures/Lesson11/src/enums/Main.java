package enums;

import enums.Day;

public class Main {
    public static void main(String[] args) {


        printWeekDay(Day.MONDAY);
        printWeekDay(Day.FRIDAY);

        Day myDay = Day.SATURDAY;
        System.out.println(myDay.isWorkingDay());
    }

    private static void printWeekDay(Day day) {
//        Day day = Day.MONDAY; // это удалили когда enum запихнули в этот метод
        switch (day) {
            case MONDAY:
                System.out.println(day.name() + " is first working day");
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(day.name() + " is workday");
                break;
            case FRIDAY:
                System.out.println("Thanks God it's " + day.name());
            case SATURDAY:
            case SUNDAY:
                System.out.println(day.name() + " is weekend");
                break;
        }
    }
}