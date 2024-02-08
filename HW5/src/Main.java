import java.util.Arrays;


public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {

        System.out.println(ANSI_YELLOW + "=========================================================================");
        System.out.println("================= Домашнее задание #5 02.02 Массивы =====================");
        System.out.println("=========================================================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "#5.1 Разложить положительные и отрицательные числа по разным массивам" + ANSI_RESET);

        // создание, наполнение и вывод исходного массива
        int negativeCounter = 0;
        int positiveCounter = 0;
        int[] initialArray = new int[15];
        System.out.print("Исходный массив: [");
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = (int) (Math.random() * 20 + 1) - 10;
            if (initialArray[i] >= 0) {
                positiveCounter++;
            } else {
                negativeCounter++;
            }
            System.out.printf("%3s", initialArray[i]);
            if (i != initialArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("]");
        System.out.println();

        int[] positiveArray = new int[positiveCounter];
        int[] negativeArray = new int[negativeCounter];
        int tempIndexPos = 0;
        int tempIndexNeg = 0;
        for (int k : initialArray) {
            if (k >= 0) {
                positiveArray[tempIndexPos] = k;
                tempIndexPos++;
            } else {
                negativeArray[tempIndexNeg] = k;
                tempIndexNeg++;
            }
        }
        System.out.print("Массив положительных чисел: [");
        for (int i = 0; i < positiveArray.length; i++) {
            System.out.printf("%3s", positiveArray[i]);
            if (i != positiveArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("], длина " + positiveArray.length);
        System.out.println();

        System.out.print("Массив отрицательных чисел: [");
        for (int i = 0; i < negativeArray.length; i++) {
            System.out.printf("%3s", negativeArray[i]);
            if (i != negativeArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("], длина " + negativeArray.length);
        System.out.println();

        if (initialArray.length == negativeArray.length + positiveArray.length) {
            System.out.println("Сумма длин новых массивов " + positiveArray.length + " и " + negativeArray.length +
                    " равна длине исходного массива " + initialArray.length);
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "#5.2 Исключить одинаковые элементы массива" + ANSI_RESET);

        int[] oldArray = new int[10];
        System.out.print("Исходный массив: [");
        for (int i = 0; i < oldArray.length; i++) {
            oldArray[i] = (int) (Math.random() * 3);
            System.out.printf("%2s", oldArray[i]);
            if (i != oldArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("]");
        System.out.println();

        int newArrayLength = oldArray.length;
        for (int i = 0; i < oldArray.length; i++) {
            for (int j = i + 1; j < newArrayLength; j++) {
                if (oldArray[i] == oldArray[j]) {
                    oldArray[j] = oldArray[newArrayLength - 1];
                    newArrayLength--;
                    j--;
                }
            }
        }
        System.out.println("Длина нового массива: " + newArrayLength);
        System.out.print("Новый массив: [");
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = oldArray[i];
            System.out.printf("%2s", newArray[i]);
            if (i != newArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");
        System.out.println();

        System.out.println(ANSI_GREEN + "#5.3 Выполнить слияние 2 упорядоченных массивов в один упорядоченный массив" + ANSI_RESET);

        int[] firstSortedArray = new int[7];
        int[] secondSortedArray = new int[7];
        int arrayFiller = 0;
        for (int i = 0; i < firstSortedArray.length; i++) {
            firstSortedArray[i] = arrayFiller + (int) (Math.random() * 10);
            arrayFiller = firstSortedArray[i];
        }
        arrayFiller = 0;
        for (int i = 0; i < secondSortedArray.length; i++) {
            secondSortedArray[i] = arrayFiller + (int) (Math.random() * 10);
            arrayFiller = secondSortedArray[i];
        }
        System.out.println(Arrays.toString(firstSortedArray));
        System.out.println(Arrays.toString(secondSortedArray));

        int[] mergedSortedArray = new int[firstSortedArray.length + secondSortedArray.length];

        int firstIndex = 0;
        int secondIndex = 0;
        for (int k = 0; k < mergedSortedArray.length; k++) {
            if (firstIndex > firstSortedArray.length - 1) {
                mergedSortedArray[k] = secondSortedArray[secondIndex];
                secondIndex++;
            } else if (secondIndex > secondSortedArray.length - 1) {
                mergedSortedArray[k] = firstSortedArray[firstIndex];
                firstIndex++;
            } else if (firstSortedArray[firstIndex] < secondSortedArray[secondIndex]) {
                mergedSortedArray[k] = firstSortedArray[firstIndex];
                firstIndex++;
            } else {
                mergedSortedArray[k] = secondSortedArray[secondIndex];
                secondIndex++;
            }
        }

        System.out.println(Arrays.toString(mergedSortedArray));
        System.out.println();

        System.out.println(ANSI_GREEN + "##5.5 Сделать транспонирование матрицы (замена строк на столбцы)" + ANSI_RESET);

        int matrixRows = 3;
        int matrixColumns = 5;
        int[][] originalMatrix = new int[matrixRows][matrixColumns];

        int filler = 1;
        for (int i = 0; i < originalMatrix.length; i++) {
            System.out.print("│");
            for (int j = 0; j < originalMatrix[i].length; j++) {
                originalMatrix[i][j] = filler;
                filler++; // использовал заполнение матрицы числами по возрастанию вместо ГСЧ для наглядности
                System.out.printf("%3s", originalMatrix[i][j]);
            }
            System.out.print("│");
            System.out.println();
        }
        System.out.println("Магия транспонирования и...");
        int[][] flipMatrix = new int[matrixColumns][matrixRows];
        for (int i = 0; i < flipMatrix.length; i++) {
            System.out.print("│");
            for (int j = 0; j < flipMatrix[i].length; j++) {
                flipMatrix[i][j] = originalMatrix[j][i];
                System.out.printf("%3s", flipMatrix[i][j]);
            }
            System.out.print("│");
            System.out.println();
        }
        System.out.println();

    }
}
