package Lesson17_2;

// Создать 3 целочисленных массива. Заполнить массивы случайными числами в 3 потока.
// Записать эти массивы в файл (общий) в параллельных потоках.
// Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.
// Доступ к файлу должен быть синхронизирован чтобы массивы не перемешались.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        final String FILENAME = "out.txt";

        try (BufferedWriter clearWriter = new BufferedWriter(new FileWriter(FILENAME, false))) {
            clearWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        ArrayWriter aw0 = new ArrayWriter(array1, 1);
        ArrayWriter aw1 = new ArrayWriter(array2, 11);
        ArrayWriter aw2 = new ArrayWriter(array3, 21);

        aw0.start();
        aw1.start();
        aw2.start();

        try {
            aw0.join();
            aw1.join();
            aw2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        SaveAsThread sat0 = new SaveAsThread(array1,FILENAME);
        SaveAsThread sat1 = new SaveAsThread(array2,FILENAME);
        SaveAsThread sat2 = new SaveAsThread(array3,FILENAME);

        sat0.start();
        sat1.start();
        sat2.start();


    }
}
