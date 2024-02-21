package HW10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HomeAppliances appliances = new HomeAppliances() {
            @Override
            public void plugIn() {

            }

            @Override
            public int getPower() {
                return 0;
            }
        };
//        List<HomeAppliances> appliances = new ArrayList<>();
        appliances.add(new Microwave());
        appliances.add(new Blender());

        // Включаем все приборы в розетку и считаем общую потребляемую мощность
        double totalPower = 0;
        for (HomeAppliances appliance : appliances) {
            appliance.plugIn();
            totalPower += appliance.getPower();
        }
        System.out.println("Общая потребляемая мощность: " + totalPower + " Вт");

        // Сортировка приборов по мощности
        appliances.sort(new PowerComparator());
        System.out.println("Приборы отсортированы по мощности:");

        for (HomeAppliances appliance : appliances) {
            System.out.println(appliance.getClass().getSimpleName() + " - " + appliance.getPower() + " Вт");
        }

        // Поиск кухонного прибора в заданном диапазоне мощности
        double minPower = 400;
        double maxPower = 800;
        System.out.println("Кухонные приборы в диапазоне от " + minPower + " до " + maxPower + " Вт:");
        for (HomeAppliances appliance : appliances) {
            if (appliance instanceof KitchenAppliances) {
                double power = appliance.getPower();
                if (power >= minPower && power <= maxPower) {
                    System.out.println(appliance.getClass().getSimpleName() + " - " + power + " Вт");
                }
            }
        }
    }
}