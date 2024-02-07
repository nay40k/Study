import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Определить, является ли массив возрастающей последовательностью

        int[] testArray = new int[]{3, 4, 4, 5, 6, 7};
        boolean isIncreasingSequence = true;
        for (int i = 0; i < testArray.length - 2; i++) {
            if (testArray[i] >= testArray[i + 1]) {
                isIncreasingSequence = false;
                break;
            }
        }
        if (isIncreasingSequence) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность случайная");
        }

        System.out.println("========================================");


//        Перевернуть массив:
//          1 2 3 4 5 -> 5 4 3 2 1

        int[] flatArray = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < flatArray.length; i++) {
            System.out.printf("%2s", flatArray[i]);
        }
        System.out.println();
        System.out.println("  Вжух!");

        for (int i = 0; i < (flatArray.length / 2); i++) {
            int temp = flatArray[i];
            flatArray[i] = flatArray[flatArray.length - 1 - i];
            flatArray[flatArray.length - 1 - i] = temp;
        }

        for (int i = 0; i < flatArray.length; i++) {
            System.out.printf("%2s", flatArray[i]);
        }

        System.out.println();
        System.out.println("========================================");

//         Перевернуть массив:
//        1 2 3    9 8 7
//        4 5 6 -> 6 5 4
//        7 8 9    3 2 1

        int[][] suddenArray = new int[3][3];
        int filler = 1;
        for (int i = 0; i < suddenArray.length; i++) {
            for (int j = 0; j < suddenArray[i].length; j++) {
                suddenArray[i][j] = filler;
                filler++;
                System.out.printf("%2s", suddenArray[i][j]);
            }
            System.out.println();
        }
        System.out.println(" Вжух!");
        int[][] flipArray = new int[3][3];
        for (int i = 0; i < flipArray.length; i++) {
            for (int j = 0; j < flipArray[i].length; j++) {
                flipArray[i][j] = suddenArray[flipArray.length - 1 - i][flipArray.length - 1 - j];
                System.out.printf("%2s", flipArray[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("========================================");


//        задание 4

        int arraySize = 6;
        System.out.println("Пользователь ввёл " + arraySize);
        int[] roboticArray = new int[arraySize];
        System.out.print("Массив от робота: [");
        for (int i = 0; i < roboticArray.length; i++) {
            roboticArray[i] = (int) (Math.random() * 11) - 5;
            System.out.printf("%2s", roboticArray[i]);
            if (i < roboticArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("]");
        System.out.println();
        if (roboticArray[])





    }
}