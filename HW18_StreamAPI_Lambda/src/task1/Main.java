package task1;
//Дана коллекция Collection<Integer> col. С помощью stream API:
// ○ найти минимальное число
// ○ найти максимальное число
// ○ найти среднее арифметическое чисел
// ○ найти произведение всех чисел
// ○ найти сумму всех чисел
// ○ найти сумму всех цифр

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> col = Arrays.asList(10, -11, -12, 13, -14, 15, 16, -17, 18, 19);

        Optional<Integer> min = col.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());


        Optional<Integer> max = col.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());


        OptionalDouble average = col.stream().mapToInt(e -> e).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }


        Optional<Integer> product = col.stream().reduce((x, y) -> x * y);
        product.ifPresent(System.out::println);

        Optional<Integer> sum = col.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);


        Integer digitSum = col.stream()
                .map(num -> num.toString().chars().map(Character::getNumericValue).sum())
                .reduce(0, Integer::sum);
        System.out.println(digitSum);

    }

}
