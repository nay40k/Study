package transport;

import java.util.regex.Pattern;

public class Taxi extends Transport {

    private String carClass; // (A-E)

    public Taxi(int fuelConsumption, int price, String carClass) {
        super(fuelConsumption, price);
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
