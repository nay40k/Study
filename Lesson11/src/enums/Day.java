package enums;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWorkingDay;

    Day(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    Day() {
        this(true);
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }


}
