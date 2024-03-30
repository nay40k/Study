package scheduler;
import java.util.*;

class Schedule {
    Map<String, List<Shift>> schedule;

    public Schedule() {
        schedule = new HashMap<>();
        schedule.put("Понедельник", Arrays.asList(new Shift("Утренняя смена", "08:30", "16:45"),
                new Shift("Вечерняя смена", "12:10", "20:00")));
        schedule.put("Вторник", Arrays.asList(new Shift("Утренняя смена", "08:30", "16:45"),
                new Shift("Вечерняя смена", "12:10", "20:00")));
        schedule.put("Среда", Arrays.asList(new Shift("Утренняя смена", "08:30", "16:45"),
                new Shift("Вечерняя смена", "12:10", "20:00")));
        schedule.put("Четверг", Arrays.asList(new Shift("Утренняя смена", "08:30", "16:45"),
                new Shift("Вечерняя смена", "12:10", "20:00")));
        schedule.put("Пятница", Arrays.asList(new Shift("Утренняя смена", "08:30", "16:45"),
                new Shift("Вечерняя смена", "12:10", "20:00")));
        schedule.put("Суббота", Arrays.asList(new Shift("Утренняя смена", "08:30", "16:45")));
        schedule.put("Воскресенье", Collections.emptyList());
    }

    public void generateSchedule(List<Employee> employees) {
        int employeeIndex = 0;
        for (String day : schedule.keySet()) {
            List<Shift> shifts = schedule.get(day);
            for (Shift shift : shifts) {
                if (day.equals("Суббота") && shift.name.equals("Вечерняя смена")) {
                    continue; // В субботу только один сотрудник работает в первую смену
                }
                System.out.println(day + ": " + shift + " - " + employees.get(employeeIndex));
                employeeIndex = (employeeIndex + 1) % employees.size();
                if (shift.name.equals("Вечерняя смена")) {
                    System.out.println(day + ": " + shift + " - " + employees.get(employeeIndex));
                    employeeIndex = (employeeIndex + 1) % employees.size();
                }
            }
        }
    }
}