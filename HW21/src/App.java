public class App {
    public static void main(String[] args) {
        Store store = new Store();
        new Producer(store);
        new Consumer(store);
    }
}