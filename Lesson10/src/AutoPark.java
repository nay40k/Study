public class AutoPark {

    private int parkSize;

    private Transport[] transports = new Transport[parkSize];

    public AutoPark(int parkSize) {
        this.parkSize = parkSize;
    }

    public int getTransportCost() {
        int total = 0;
        for (Transport transport : transports) {
            total += transport.getPrice();
        }
        return total;
    }

    //TODO Реализовать добавление транспорта
}
