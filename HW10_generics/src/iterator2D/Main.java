//Написать итератор по массиву (посмотрите interface Iterator).
//Ваш класс должен содержать 2 метода - hasNext() и next()

package iterator2D;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[][] numbers = new Integer[5][3];
        Random random = new Random();
        // Заполняем массив случайными числами
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
            }
        }

        ArrayIterator2D<Integer> iterator = new ArrayIterator2D<>(numbers);


            while (iterator.hasNext()) {
                Integer number = iterator.next();
                System.out.printf("%d\t", number);
            }


    }
}