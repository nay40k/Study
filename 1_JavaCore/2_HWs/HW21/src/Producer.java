class Producer implements Runnable {
    Store store;

    Producer(Store store) {
        this.store = store;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            store.put();
        }
    }
}