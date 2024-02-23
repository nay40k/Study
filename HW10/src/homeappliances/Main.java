package homeappliances;

public class Main {
    public static void main(String[] args) {
        Pluggable[] appliances = {
                new Fridge("Холодильник", 200),
                new Toaster("Микроволновка", 800),
                new TV("Телевизор", 150)
        };

        Apartment apartment = new Apartment(appliances);

        // Включаем некоторые приборы
        appliances[0].plugIn();
        appliances[2].plugIn();

        // Рассчитываем потребляемую мощность
        System.out.println("Суммарная потребляемая мощность: " + apartment.calculateTotalPower() + "Вт");

        // Сортируем приборы по мощности
        apartment.sortByPower();
        for (Pluggable appliance : appliances) {
            System.out.println(appliance.getName() + ": " + appliance.getPower() + "Вт");
        }

        // Ищем кухонный прибор в заданном диапазоне мощности
        KitchenAppliance foundAppliance = apartment.findKitchenApplianceInRange(100, 500);
        if (foundAppliance != null) {
            System.out.println("Кухонные приборы в заданном диапазоне мощности: " + foundAppliance.getName());
        } else {
            System.out.println("Кухонных приборов в заданном диапазоне не найдено.");
        }
    }
}