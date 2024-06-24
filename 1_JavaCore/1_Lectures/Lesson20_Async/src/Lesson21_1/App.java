package Lesson21_1;

public class App {
    public static void main(String[] args) {
        Buffer store = new Buffer();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
