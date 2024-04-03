package Lesson21_1;

public class Producer implements Runnable {

    Buffer store;

    Producer(Buffer buffer) {
        this.store = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            store.put();
        }

    }
}