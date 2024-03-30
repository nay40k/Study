package scheduler;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ольга Т."),
                new Employee("Марина"),
                new Employee("Алеся"),
                new Employee("Ольга М."),
                new Employee("Наталья"),
                new Employee("Татьяна"));

        Schedule schedule = new Schedule();
        schedule.generateSchedule(employees);
    }
}