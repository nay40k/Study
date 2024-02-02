import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        из презентации
//        int[] array = new int[10];         // объявление и инициализация массива
//        Random random = new Random();      // пакет java.util.Random
//
//        // заполнение массива случайными числами
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//        }
//
//        // вывод значений массива на экран
//        System.out.println("Initial array: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        // изменение значений массива на +10
//        for (int i = 0; i < array.length; i++) {
//            array[i] += 10;
//        }
//
//        // вывод значений массива на экран при помощи цикла for-each
//        System.out.println("Final array: ");
//        for (int i : array) {
//            System.out.print(i + " ");
//        }


//        была задача создать, заполнить и вывести двумерный массив
//        Random random = new Random();
//        int[][] array = new int[3][];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[3];
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = random.nextInt(10);
//            }
//        }
//
//        for (int[] ints : array) {
//            for (int anInt : ints) {
//                System.out.printf("%3s", anInt);
//            }
//            System.out.println();
//    }


//        задача создать массив заданной размерности, заполнить рандомными числами, вывести максимальное
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1) - 10;
            System.out.printf("%3s", array[i]);
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Наибольшее число в массиве: " + max);

    }
}