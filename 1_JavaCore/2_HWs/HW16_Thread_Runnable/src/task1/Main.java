package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();

        Generator generator = new Generator(numbersList);

        generator.start();

        try {
            generator.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сгенерированные числа:");
        for (Integer number : numbersList) {
            System.out.print(number + " ");
        }

    }
}
