package Lesson21_1;

public class Buffer {
    private int messageCount = 0;
    public synchronized void get() {
        while (messageCount < 1) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        messageCount--;
        notifyAll();
    }
    public synchronized void put() {
        while (messageCount >= 3) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        messageCount++;
        notifyAll();
    }
}
