package Movable;

public class Drone implements Movable {

    @Override
    public void move(int distance) {
        System.out.println("Moving ..." + distance);
    }

    public void recharge() {
        System.out.println("Recharged");
    }

}
