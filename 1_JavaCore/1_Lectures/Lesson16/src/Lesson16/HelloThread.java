package Lesson16;

public class HelloThread extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {

        }

        System.out.println("Hello from " + this.getName());
    }
}
