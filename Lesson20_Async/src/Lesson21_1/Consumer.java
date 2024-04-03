package Lesson21_1;

public class Consumer implements Runnable {

    Buffer buffer;

    Consumer(Buffer store) {
        this.buffer = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.get();
        }

    }
}