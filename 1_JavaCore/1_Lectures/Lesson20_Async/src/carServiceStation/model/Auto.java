package carServiceStation.model;

import java.util.Random;

public class Auto extends Car {

    public Auto(String model) {
        super(model);
    }

    //    public void doService(){
//        System.out.println(ANSI_YELLOW + "Car " + id + " " + model + " started service" + ANSI_RESET);
//        try {
//            Thread.sleep(new Random().nextInt(1000) + 1000);
//        } catch (InterruptedException ignore) {}
//        System.out.println(ANSI_RED + "Car " + id + " " + model + " finished service" + ANSI_RESET);
//    }
    public int doService() {
        int repairBill;
        int serviceTime = (int) (Math.random() * 1000) + 1000;
        int repairCost = 10;

        System.out.println(ANSI_YELLOW + "Car " + id + " " + model + " started service" + ANSI_RESET);
        try {
            Thread.sleep(serviceTime);
        } catch (InterruptedException ignore) {}
        repairBill = serviceTime * repairCost;
        System.out.println(ANSI_RED + "Car " + id + " " + model + " finished service" + ANSI_RESET);
        return repairBill;
    }

}
