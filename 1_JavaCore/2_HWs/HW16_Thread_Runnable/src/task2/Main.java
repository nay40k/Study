package task2;
/*
Пользователь вводит с клавиатуры значение в массив.
После чего запускаются два потока.
Первый поток находит максимум в массиве, второй — минимум.
Результаты вычислений возвращаются в метод main()
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        MaxFinder maxFinder = new MaxFinder(array);
        MinFinder minFinder = new MinFinder(array);

        maxFinder.start();
        minFinder.start();

        try {
            maxFinder.join();
            minFinder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Максимум в массиве: " + maxFinder.getMax());
        System.out.println("Минимум в массиве: " + minFinder.getMin());
    }
}



