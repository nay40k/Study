import java.util.concurrent.Semaphore;

class Store {
    private int product = 0;
    private final Semaphore semCons = new Semaphore(0);
    private final Semaphore semProd = new Semaphore(1);

    public void get() {
        try {
            semCons.acquire();
            System.out.printf("""
                    Покупатель купил 1 товар
                    Товаров на складе: %d
                    """, --product);
            semProd.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void put() {
        try {
            semProd.acquire();
            System.out.printf("""
                    Производитель добавил 1 товар
                    Товаров на складе: %d
                    """, ++product);
            semCons.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }
}