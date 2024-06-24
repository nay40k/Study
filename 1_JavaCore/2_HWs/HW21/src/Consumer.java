class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            store.get();
        }
    }
}