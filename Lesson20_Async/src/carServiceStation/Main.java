package carServiceStation;

import carServiceStation.model.Auto;
import carServiceStation.model.Car;
import carServiceStation.model.Truck;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();

        Truck truck1 = new Truck("T1000");
        Truck truck2 = new Truck("T1001");
        Truck truck3 = new Truck("T1002");
        Truck truck4 = new Truck("T1003");
        Truck truck5 = new Truck("T1004");
        Truck truck6 = new Truck("T1005");

        Auto auto1 = new Auto("Dodge Challenger");
        Auto auto2 = new Auto("T601");
        Auto auto3 = new Auto("T602");
        Auto auto4 = new Auto("T603");

        List<Car> cars = Arrays.asList(truck1, truck2, truck3, truck4, truck5, truck6, auto1, auto2, auto3, auto4);
        cars.stream().sorted(Comparator.comparingInt(Car::getId)).forEach(serviceStation::doService);

//        serviceStation.doService(truck1);
//        serviceStation.doService(truck2);
//        serviceStation.doService(truck3);
//        serviceStation.doService(truck4);
//        serviceStation.doService(truck5);
//        serviceStation.doService(truck6);
//        serviceStation.doService(auto1);
//        serviceStation.doService(auto2);
//        serviceStation.doService(auto3);
//        serviceStation.doService(auto4);

        serviceStation.goHome();


    }
}
