package autopark.transport;

public class Taxi extends Transport {

    private String carClass; // (A-E)

    public Taxi(String model, int fuelConsumption, int price, String carClass) {
        super(model, fuelConsumption, price);
        this.carClass = carClass;
    }

//    public void setCarClass(String carClass) {
//        if (carClass.matches("[A-E]") ) {
//            this.carClass = carClass;
//        } else {
//            System.out.println("Введите класс авто [А-Е]");
//        }
//    }
}
