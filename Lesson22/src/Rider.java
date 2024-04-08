import java.util.concurrent.Semaphore;

public class Rider implements Runnable {

//    Semaphore semaphore;

    String name;

    Rider(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " ожидает проверки");
        synchronized (this) {
            try {
                this.wait((long) (Math.random() * 2500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " прошел проверку.");
    }
}

