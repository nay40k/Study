package carServiceStation;

import carServiceStation.model.Car;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ServiceStation {

    private final ExecutorService queue = Executors.newFixedThreadPool(2);



    public void doService(Car car) {
        Future<?> result = queue.submit(car::doTO);

    }

    public void goHome() {
        queue.shutdown();
    }
    public void fireAlarm() {
        queue.shutdownNow();
    }

}
