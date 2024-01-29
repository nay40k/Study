import java.util.Arrays;

public class Main {

    public static double getSegmentLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double getDiagonalOfTheRectangle(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        System.out.println("### Задание #2 23.01 Типы данных. Переменные. Операторы ###");
        System.out.println("Задание 1:");
        int integer1 = 896983465;
        System.out.println("Последняя цифра числа " + integer1 + " равна " + integer1 % 10);
        System.out.println("================================================");

        System.out.println("Задание 2:");
        int integer2 = 3216;
        System.out.println("Сумма чисел ab + cd числа abcd (" + integer2 + ") равно " + (integer2 % 100 + integer2 / 100));
        System.out.println("================================================");

        System.out.println("Задание 3:");
        int integer3 = 12645;
        System.out.println("Третья цифра числа " + integer3 + " равна " + (integer3 / 100 % 10));
        System.out.println("================================================");

        System.out.println("Задание 4:"); //выполнил через функцию
        //ввести координаты: (x1, y1, x2, y2)
        System.out.println("Длина отрезка = " + getSegmentLength(0, 7, 7, 7));
        System.out.println("================================================");

        System.out.println("Задание 5:"); //выполнил через функцию
        int circleRadius = 5;
        System.out.println(getDiagonalOfTheRectangle(6, 8));
        if (circleRadius * 2 >= getDiagonalOfTheRectangle(6, 8)) {
            System.out.println("Закроет");
        } else {
            System.out.println("Не закроет");
        }
        System.out.println("================================================");

        System.out.println("Задание 6:"); //в этом задании координаты точек решил передавать в массивах
        float[] dotA = new float[]{0, 7};
        float[] dotB = new float[]{1, 11};
        float k = (dotB[1] - dotA[1]) / (dotB[0] - dotA[0]);
        float b = dotA[1] - k * dotA[0];
        System.out.println("Координаты точки A [x, y] = " + Arrays.toString(dotA));
        System.out.println("Координаты точки B [x, y] = " + Arrays.toString(dotB));
        System.out.println("Уравнение прямой, проходящей через эти точки:");
        if (b == 0) {
            System.out.println("y = " + k + "x");
        } else if (b < 0) {
            System.out.println("y = " + k + "x - " + Math.abs(b));
        } else {
            System.out.println("y = " + k + "x + " + b);
        }
        System.out.println("================================================");
    }
}
