package carServiceStation.model;

import java.util.Random;

public class Truck extends Car {


    public Truck(String model) {
        super(model);
    }

//    public int doService(){
//        System.out.println(ANSI_GREEN + "Truck " + id + " " + model + " started service" + ANSI_RESET);
//        try {
//            Thread.sleep(new Random().nextInt(1000) + 3000);
//        } catch (InterruptedException ignore) {}
//        System.out.println(ANSI_RED + "Truck " + id + " " + model + " finished service "+ ANSI_RESET);
//        return 0;
//    }

    public int doService() {
        int repairBill;
        int serviceTime = (int) (Math.random() * 3000) + 1000;
        int repairCost = 10;

        System.out.println(ANSI_GREEN + "Truck " + id + " " + model + " started service" + ANSI_RESET);
        try {
            Thread.sleep(serviceTime);
        } catch (InterruptedException ignore) {}
        repairBill = serviceTime * repairCost;

        System.out.println(ANSI_RED + "Truck " + id + " " + model + " finished service " + ANSI_RESET);
        return repairBill;
    }


}
