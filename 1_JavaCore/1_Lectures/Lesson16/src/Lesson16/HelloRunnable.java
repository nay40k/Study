package Lesson16;

public class HelloRunnable implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException ignored) {

        }
        System.out.println("Hello from " + Thread.currentThread().getName());

    }
}
