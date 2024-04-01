/*
 Создайте матрицу размера n*m.
 Создайте два потока, один из которых перемножает все значения в столбцах и потом находит сумму,
 а другой поток перемножает все значения в строках и тоже потом находит сумму.
 Определите какое число больше. Обязательно использовать пулы потоков
*/
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        int n = 3;
        int m = 3;

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 4);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> columnProductSumFuture = executorService.submit(() -> {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int product = 1;
                for (int i = 0; i < n; i++) {
                    product *= matrix[i][j];
                }
                sum += product;
            }
            return sum;
        });

        Future<Integer> rowProductSumFuture = executorService.submit(() -> {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int product = 1;
                for (int j = 0; j < m; j++) {
                    product *= matrix[i][j];
                }
                sum += product;
            }
            return sum;
        });

        int columnProductSum = 0;
        int rowProductSum = 0;
        try {
            columnProductSum = columnProductSumFuture.get();
            rowProductSum = rowProductSumFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

        System.out.println("Сумма произведений в столбцах: " + columnProductSum);
        System.out.println("Сумма произведений в строках: " + rowProductSum);

        if (columnProductSum > rowProductSum) {
            System.out.println("Сумма произведений в столбцах больше и равна " + columnProductSum);
        } else if (rowProductSum > columnProductSum) {
            System.out.println("Сумма произведений в строках больше и равна " + rowProductSum);
        } else {
            System.out.println("Суммы произведений в строках и в столбцах равны и равны " + rowProductSum);
        }
    }
}
