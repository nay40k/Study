package Lesson21_2;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    Semaphore semaphore;
    Worker (Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i < 5; i++) {
                semaphore.acquire();

                Thread.sleep(1000);

                semaphore.release();
            }
        } catch (InterruptedException ignore) {}
    }
}
