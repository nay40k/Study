package transport;
//Парк общественного транспорта.
//Определить иерархию различных видов ОТ.
//Создать парк ОТ.
//Рассчитать стоимость автопарка.
//Провести сортировку машин парка по расходу топлива.
//Найти автобус в компании, соответствующий заданному диапазону параметров.


public abstract class Transport {

    public int price;

    public int fuelConsumption;

    public Transport(int fuelConsumption, int price) {
        this.fuelConsumption = fuelConsumption;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }



}
