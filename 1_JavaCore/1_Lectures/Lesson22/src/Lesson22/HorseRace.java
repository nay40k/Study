package Lesson22;/*
* Несколько всадников с лошадьми должны пройти контроль перед скачками.
* Количество контролеров меньше количества всадников,
* поэтому некоторые всадники будут дожидаться, пока не освободится один из контролеров.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HorseRace {

    public static void main(String[] args) {

        int ridersCount = 10;
        int controllersCount = 3;

        ExecutorService queue = Executors.newFixedThreadPool(controllersCount);

//        Semaphore semaphore = new Semaphore(controllersCount);
        for (int i = 1; i <= ridersCount; i++) {
//            Lesson22.Rider rider = new Lesson22.Rider(semaphore);
//            new Thread(rider).start();
            Runnable rider = new Rider("всадник " + i);
            queue.execute(rider);
        }



    }
}