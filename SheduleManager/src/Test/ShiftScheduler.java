package Test;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ShiftScheduler {

    static class Shift {
        String name;
        String startTime;
        String endTime;

        public Shift(String name, String startTime, String endTime) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return name + " (" + startTime + " - " + endTime + ")";
        }
    }

    static class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ольга Т."));
        employees.add(new Employee("Марина"));
        employees.add(new Employee("Алеся"));
        employees.add(new Employee("Ольга М."));
        employees.add(new Employee("Наташа"));
        employees.add(new Employee("Татьяна"));

        Shift morningShift = new Shift("Утренняя смена", "08:30", "16:45");
        Shift eveningShift = new Shift("Вечерняя смена", "12:10", "20:00");

        LocalDate startDate = LocalDate.of(2024, 4, 1); // Начало апреля 2024 года
        LocalDate endDate = LocalDate.of(2024, 4, 30); // Конец апреля 2024 года

        System.out.println("Рабочий график на апрель 2024 года:");
        LocalDate currentDate = startDate;
        int eveningShiftIndex = 0;

        while (!currentDate.isAfter(endDate)) {
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            System.out.println("Дата: " + currentDate);

            if (dayOfWeek == DayOfWeek.SUNDAY) {
                System.out.println("  Выходной");
            } else {
                List<Employee> morningShiftEmployees = new ArrayList<>(employees);
                Employee firstEmployeeForEveningShift = null;
                Employee secondEmployeeForEveningShift = null;

                if (dayOfWeek != DayOfWeek.SATURDAY) {
                    firstEmployeeForEveningShift = employees.get(eveningShiftIndex % employees.size());
                    secondEmployeeForEveningShift = employees.get((eveningShiftIndex + 1) % employees.size());
                    morningShiftEmployees.remove(firstEmployeeForEveningShift);
                    morningShiftEmployees.remove(secondEmployeeForEveningShift);
                    eveningShiftIndex += 2;
                } else {
                    firstEmployeeForEveningShift = employees.get(eveningShiftIndex % employees.size());
                    morningShiftEmployees.remove(firstEmployeeForEveningShift);
                    eveningShiftIndex++;
                }

                System.out.println("  " + morningShift + ":");
                for (Employee employee : morningShiftEmployees) {
                    System.out.println("    " + employee.name);
                }

                if (dayOfWeek == DayOfWeek.SATURDAY) {
                    System.out.println("  " + eveningShift + " - " + firstEmployeeForEveningShift.name);
                } else {
                    System.out.println("  " + eveningShift + " - " + firstEmployeeForEveningShift.name + ", " + secondEmployeeForEveningShift.name);
                }
            }

            currentDate = currentDate.plusDays(1);
        }
    }
}

