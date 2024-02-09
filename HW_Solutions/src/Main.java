public class Main {
    public static void main(String[] args) {
        int[] oldArray = new int[10];
        System.out.print("Исходный массив: [");
        for (int i = 0; i < oldArray.length; i++) {
            oldArray[i] = (int) (Math.random() * 5);
            System.out.printf("%2s", oldArray[i]);
            if (i != oldArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");

        int newArrayLength = oldArray.length;
        for (int i = 0; i < oldArray.length; i++) {
            for (int j = i + 1; j < oldArray.length; j++) {
                if (oldArray[i] == oldArray[j]) {
                    newArrayLength--;
                    break;
                }
            }
        }
        int[] newArray = new int[newArrayLength];

        int uniqueInd = 0;
        for (int item : oldArray) {
            boolean isInNewArr = false;
            for (int i = 0; i < uniqueInd; i++) {
                if (newArray[i] == item) {
                    isInNewArr = true;
                    break;
                }
            }
            if (!isInNewArr) {
                newArray[uniqueInd] = item;
                uniqueInd++;
            }
        }

        System.out.print("Массив чисел в ед.ч.: [");
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("%2s", newArray[i]);
            if (i != newArray.length - 1) {
                System.out.print(";");
            }
        }
        System.out.println("]");

//        for (int i = 0; i < newArray.length; i++)   System.out.print(newArray[i] + " ");
//        System.out.println();


//        тут в комментариях просто цикл перекладки одного массива в другой
//        System.out.println("Длина нового массива: " + newArrayLength);
//        System.out.print("Новый массив: [");
//        int[] newArray = new int[newArrayLength];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = oldArray[i];
//            System.out.printf("%2s", newArray[i]);
//            if (i != newArray.length - 1) {
//                System.out.print(";");
//            }
//        }
//        System.out.println("]");
//        System.out.println("=========================================================================================");


//        System.out.print("Копия массива:   [");
//        // копия массива для особых зверств (метод из инета)
//        for (int i = 0; i < oldArrayCopy.length; i++) {
//            int value = oldArrayCopy[i];
//            System.out.printf("%2s", value);
//            if (i != oldArray.length - 1) {
//                System.out.print(";");
//            }
//        }
//        System.out.print("]");
//        System.out.println();
//        System.out.println();
////        int[] arrayForSecondMethod = new int[newArrayLength]; // короткий
//        System.out.println("Некая абракадабра:");


//        int[] oldArray = new int[10];
//        System.out.print("Исходный массив: [");
//        for (int i = 0; i < oldArray.length; i++) {
//            oldArray[i] = (int) (Math.random() * 3);
//            System.out.printf("%2s", oldArray[i]);
//            if (i != oldArray.length - 1) {
//                System.out.print(";");
//            }
//        }
//        System.out.print("]");
//        System.out.println();

//        int[] arrayForSecondMethod = {4, 1, 1, 1, 0, 2, 1, 3, 3, 4};
//        int uniqueElements = arrayForSecondMethod.length;
//        for (int i = 0, k; i != uniqueElements; i++, uniqueElements = k) {
//            for (int j = k = i + 1; j != uniqueElements; j++) {
//                if (arrayForSecondMethod[j] != arrayForSecondMethod[i]) {
//                    if (k != j) arrayForSecondMethod[k] = arrayForSecondMethod[j];
//                    k++;
//                }
//            }
//        }
//
//        if (uniqueElements != arrayForSecondMethod.length) {
//            int[] newArray2 = new int[uniqueElements];
//            for (int i = 0; i < uniqueElements; i++) newArray2[i] = arrayForSecondMethod[i];
//            arrayForSecondMethod = newArray2;
//        }
//
//        for (int x : arrayForSecondMethod) System.out.print(x + " ");
//        System.out.println();


    }
}