//Парк общественного транспорта.
//Определить иерархию различных видов ОТ.
//Создать парк ОТ.
//Рассчитать стоимость автопарка.
//Провести сортировку машин парка по расходу топлива.
//Найти автобус в компании, соответствующий заданному диапазону параметров.

import transport.Taxi;

public class Main {
    public static void main(String[] args) {
        AutoPark autoPark = new AutoPark(15);

        Taxi taxi1 = new Taxi(7, 10000, "C");
        Taxi taxi2 = new Taxi(8, 12000, "D");
        autoPark.addTransport(taxi1);
        autoPark.addTransport(taxi2);
    }
}