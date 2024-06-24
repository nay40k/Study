package carServiceStation;

import carServiceStation.model.Car;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ServiceStation {

    private final ExecutorService queue = Executors.newFixedThreadPool(2);



    public Future<Integer> doService(Car car) {
        return queue.submit(car::doService);
    }

    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " тенге.");
    }

//    public int doService(Car car) {
//        int repairBill = 0;
//        Future<?> result = queue.submit(car::doService);
//
//        return repairBill;
//    }

    public void goHome() {
        queue.shutdown();
    }
    public void fireAlarm() {
        queue.shutdownNow();
    }

}
