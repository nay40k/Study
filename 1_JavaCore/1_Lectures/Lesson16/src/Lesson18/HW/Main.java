package Lesson18.HW;

//Дана коллекция Collection<Integer> col. С помощью stream API:
// ○ найти минимальное число
// ○ найти максимальное число
// ○ найти среднее арифметическое чисел
// ○ найти произведение всех чисел
// ○ найти сумму всех чисел
// ○ найти сумму всех цифр

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> col = Arrays.asList(1, 3, 10, 9, 12, 7, -4, 5, 9, 6);

        Optional<Integer> minResult = col.stream().min(Comparator.naturalOrder());
        if (minResult.isPresent()) {
            System.out.println(minResult.get());
        } else {
            System.out.println("Not present");
        }

        Optional<Integer> maxResult = col.stream().max(Comparator.naturalOrder());
        if (maxResult.isPresent()) {
            System.out.println(maxResult.get());
        }

        OptionalDouble average = col.stream().mapToInt(e -> e).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }


        Optional<Integer> product = col.stream().reduce((x, y) -> x * y);
        if (product.isPresent()) {
            System.out.println(product.get());
        }

        Optional<Integer> sum = col.stream().reduce((x, y) -> x + y);
        if (sum.isPresent()) {
            System.out.println(sum.get());
        }

        Integer digitSum = col.stream()
//                .map(Math::abs)
                .map(num -> num.toString()
                .filter()
                        .chars()
                        .map(Character::getNumericValue).sum())
                .reduce(0, Integer::sum);
        System.out.println(digitSum);



    }

}
