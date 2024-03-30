import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Integer>> result = executorService.submit(getFibonacci(14));
        while (true) {
            System.out.println("Что-то происходит");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (result.isDone()) {
                try {
                    System.out.println(result.get());
                } catch (Exception ignored) {}
                break;
            }
        }

        executorService.shutdown();

    }

    public static Callable<List<Integer>> getFibonacci(int n) {
        return () -> {
            List<Integer> result = new ArrayList<>();
            switch (n) {
                case 1:
                    return Collections.singletonList(0);
                case 2:
                    return Collections.singletonList(1);
                default:
                    int a = 0;
                    int b = 1;
                    result.add(a);
                    result.add(b);
                    for (int i = 2; i < n; i++) {
                        Thread.sleep(1000);
                        int c = a + b;
                        a = b;
                        b = c;
                        result.add(c);
                    }
                    return result;
            }
        };
    }
}