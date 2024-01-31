public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_GREEN + "### Домашнее задание #4 30.02 Циклы ###" + ANSI_RESET);

        System.out.println(ANSI_YELLOW + "=========================================================================================");
        System.out.println("========================== Домашнее задание #4 30.02 Циклы ==============================");
        System.out.println("=========================================================================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "#4.1 Создайте программу, вычисляющую факториал натурального числа n" + ANSI_RESET);
        int input = 5;
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = i * factorial;
        }
        System.out.println(input + "! = " + factorial);

        System.out.println(ANSI_GREEN + "#4.2 Найдите сумму и произведение цифр числа, введенного с клавиатуры" + ANSI_RESET);
        int randomNumber = (int) (Math.random() * 999); //рандом вместо ручного ввода
        int tempRandomNumberSum = randomNumber;
        int tempRandomNumberMult = randomNumber;
        System.out.println("Число: " + tempRandomNumberSum);
        int sumOfTheDigitsOfTheNumber = 0;
        int multiplyingTheDigitsOfTheNumber = 1;
        while (tempRandomNumberSum > 0) {
            sumOfTheDigitsOfTheNumber += (tempRandomNumberSum % 10);
            tempRandomNumberSum /= 10;
        }
        System.out.println("Сумма цифр числа: " + sumOfTheDigitsOfTheNumber);
        while (tempRandomNumberMult > 0) {
            multiplyingTheDigitsOfTheNumber *= (tempRandomNumberMult % 10);
            tempRandomNumberMult /= 10;
        }
        System.out.println("Произведение цифр числа: " + multiplyingTheDigitsOfTheNumber);

        System.out.println(ANSI_GREEN + "#4.3 Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс" + ANSI_RESET);
        randomNumber = (int) (Math.random() * 999999); //рандом вместо ручного ввода
        System.out.printf("%30s",  "Введённое число: "); //форматированный вывод чтобы в консоли числа были друг над другом
        System.out.println(randomNumber);
        int max = 0;
        int index = 0;
        for (int i = 0; randomNumber > 0; i++) {
            if ((randomNumber % 10) > max) {
                max = (randomNumber % 10);
                index = i;
            }
            randomNumber /= 10;
        }
        System.out.printf("%30s", "Самая большая цифра числа: ");
        System.out.println(max);
        System.out.printf("%30s", "Индекс цифры (справа налево): ");
        System.out.println(index);

        System.out.println(ANSI_GREEN + "#4.4 Задача про суеверия армий Японии и Германии" + ANSI_RESET);
        int counter = 0;
        for (int i = 1; i <= 99999; i++) {
            for (int j = 1; j <= 1000; j *= 10) {
                if (i / j % 10 == 4 || (i / j % 100 == 13)) {
                    counter += 1;
//                    System.out.printf("%05d", i);
//                    System.out.println();
                    break;
                }

            }
//                i /= 10;
        }
        System.out.println();
        System.out.println(counter);

    }
}