package Lesson16;

public class Main {
    public static void main(String[] args) {

        HelloThread helloThread = new HelloThread();
        helloThread.start();

        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);

        helloThread.setName("Lesson16.HelloThread");
        thread.setName("JustThread");


        thread.start();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ignored) {
//
//        }

        try {
            helloThread.join();
//            thread.join();
        } catch (InterruptedException ignored) {
        }
        System.out.println("Hello from " + Thread.currentThread().getName());

    }
}