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
        int[] array = new int[10];
        System.out.print("Исходный массив: [");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1) - 10;
            if (array[i] >= 0) {
                positiveCounter++;
            } else {
                negativeCounter++;
            }
            System.out.printf("%3s", array[i]);
            if (i != array.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("]");
        System.out.println();

        int[] positiveArray = new int[positiveCounter];
        int[] negativeArray = new int[negativeCounter];
        int tempIndexPos = 0;
        int tempIndexNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArray[tempIndexPos] = array[i];
                tempIndexPos++;
            } else if (array[i] < 0) {
                negativeArray[tempIndexNeg] = array[i];
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

        if (array.length == negativeArray.length + positiveArray.length) {
            System.out.println("Сумма длин новых массивов " + positiveArray.length + " и " + negativeArray.length +
                    " равна длине исходного массива " + array.length);
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "#5.2 Исключить одинаковые элементы массива" + ANSI_RESET);

        int[] oldArray = new int[10];
        System.out.print("Исходный массив: [");
        for (int i = 0; i < oldArray.length; i++) {
            oldArray[i] = (int) (Math.random() * 5);
            System.out.printf("%2s", oldArray[i]);
            if (i != oldArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.print("]");
        System.out.println();

//        int newArrayLength = oldArray.length;
//        for (int i = 0; i < oldArray.length; i++) {
//            for (int j = i + 1; j < oldArray.length; j++) {
//                if (oldArray[i] == oldArray[j]) {
//                    newArrayLength--;
//                    break;
//                }
//            }
//        }
//        int[] newArray = new int[newArrayLength];

        int newArrayLength2 = oldArray.length;
        for (int i = 0; i < newArrayLength2; i++) {
            for (int j = i + 1; j < newArrayLength2; j++) {
                if (oldArray[i] == oldArray[j]) {
                    oldArray[j] = oldArray[newArrayLength2 - 1];
                    newArrayLength2--;
                    j--;
                }
            }
        }
        System.out.println("Длина нового массива: " + newArrayLength2);

        System.out.println("Преобразованный массив: ");
        System.out.println(Arrays.toString(oldArray));

        int[] newArray = Arrays.copyOf(oldArray, newArrayLength2);
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(newArray));

        //removeDuplicates(oldArray);


    }

    private static void removeDuplicates(int[] arrayWithDuplicates) {
        System.out.println("==========================================");
        System.out.println("Массив с дубликатами: ");

        for (int arrayWithDuplicate : arrayWithDuplicates) {
            System.out.print(arrayWithDuplicate + "\t");
        }
        int noOfUniqueElements = arrayWithDuplicates.length;

        for (int i = 0; i < noOfUniqueElements; i++) {
            for (int j = i + 1; j < noOfUniqueElements; j++) {

                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }

        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
        System.out.println();
        System.out.println("Массив без дубликатов: ");
        for (int arrayWithoutDuplicate : arrayWithoutDuplicates) {
            System.out.print(arrayWithoutDuplicate + "\t");
        }
        System.out.println();
        System.out.println("==========================================");
    }
}