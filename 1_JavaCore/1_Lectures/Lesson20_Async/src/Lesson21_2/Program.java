package Lesson21_2;

import java.util.concurrent.Semaphore;

public class Program {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        for (int i = 1; i < 10; i++) {
            Worker worker = new Worker(semaphore);
            new Thread(worker).start();
        }
    }
}
