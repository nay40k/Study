
public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {

        System.out.println(ANSI_YELLOW + "=========================================================================");
        System.out.println("================= Домашнее задание #5 02.02 Массивы =====================");
        System.out.println("=========================================================================" + ANSI_RESET);

        System.out.println(ANSI_GREEN + "#5.1 Разложить положительные и отрицательные числа по разным массивам" + ANSI_RESET);

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
        System.out.println("]");

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
        System.out.println("], длина " + positiveArray.length);

        System.out.print("Массив отрицательных чисел: [");
        for (int i = 0; i < negativeArray.length; i++) {
            System.out.printf("%3s", negativeArray[i]);
            if (i != negativeArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("], длина " + negativeArray.length);

        if (initialArray.length == negativeArray.length + positiveArray.length) {
            System.out.println("Сумма длин новых массивов " + positiveArray.length + " и " + negativeArray.length + " равна длине исходного массива " + initialArray.length);
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
        System.out.println("]");

        int newArrayLength = oldArray.length;
        for (int i = 0; i < oldArray.length; i++) {
            for (int j = i + 1; j < newArrayLength; j++) {      // поясню:
                if (oldArray[i] == oldArray[j]) {               // если мы находим совпадение в соседней ячейке
                    oldArray[j] = oldArray[newArrayLength - 1]; // записываем в эту ячейку значение из последней ячейки
                    newArrayLength--;                           // из-за появления повторки сокращаем длину нового массива
                    j--;                                        // заходим на повторную итерацию проверки соседней ячейки
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
        System.out.print("Массив 1: [");
        for (int i = 0; i < firstSortedArray.length; i++) {
            System.out.printf("%3s", firstSortedArray[i]);
            if (i != firstSortedArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");
        System.out.print("Массив 2: [");
        for (int i = 0; i < secondSortedArray.length; i++) {
            System.out.printf("%3s", secondSortedArray[i]);
            if (i != secondSortedArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");

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

        System.out.print("Итоговый массив: [");
        for (int i = 0; i < mergedSortedArray.length; i++) {
            System.out.printf("%3s", mergedSortedArray[i]);
            if (i != mergedSortedArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");
        System.out.println();

        System.out.println(ANSI_GREEN + "##5.4 Найти строку матрицы с максимальной суммой элементов" + ANSI_RESET);

        int rows = 5;
        int columns = 5;
        int[][] matrix = new int[rows][columns];
        int maxSum = 0;
        int maxSumRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 9);
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxSumRowIndex = i;
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("│");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3s", matrix[i][j]);
            }
            System.out.print("│");
            System.out.println();
        }
        System.out.println();
        System.out.println("Строка с максимальной суммой:");
        System.out.print(" ");
        for (int i = 0; i < matrix[maxSumRowIndex].length; i++) {
            System.out.printf("%3s", matrix[maxSumRowIndex][i]);
        }
        System.out.println();
        System.out.println();

        System.out.println(ANSI_GREEN + "##5.5 Сделать транспонирование матрицы (замена строк на столбцы)" + ANSI_RESET);

        int matrixRows = 3;
        int matrixColumns = 4;
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

        System.out.println(ANSI_GREEN + "##5.6 Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать." + ANSI_RESET);

        int size = 5;
        int[][] arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("│");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 21) - 10;
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.print("│");
            System.out.println();
        }
        System.out.println("\t╬ Вжух! ╬");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[arr[i].length - 1 - i][arr[i].length - 1 - j];
                arr[arr[i].length - 1 - i][arr[i].length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("│");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.print("│");
            System.out.println();
        }
        System.out.println();

    }
}