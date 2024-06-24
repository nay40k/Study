import transport.Transport;

public class AutoPark {

    private int parkSize;

    public Transport[] transports = new Transport[parkSize];

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

    private int counter = 0;
    public void addTransport(Transport item) {
        transports[counter] = item;
        counter++;
//        if (counter < transports.length) {
//            transports[counter] = item;
//            counter++;
//        } else {
//            System.out.println("No more places");
//        }
    }
}
