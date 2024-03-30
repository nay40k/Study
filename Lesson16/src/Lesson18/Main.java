package Lesson18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Applicable func = (a, b) -> {
          int result = 1;
          for (int i = 0; i < b; i++) {
              result *= a;
          }
          return result;
        };

//        int pow = func.apply(2,3);
//        System.out.println(pow);

        List<Integer> ints = Arrays.asList(1, 3, 9, 12, 0, 7,-4, 5, 9, 6);

//        List<Integer> sortedList = ints.stream().sorted().collect(Collectors.toList());

//        sortedList.forEach(i -> System.out.print(i + " "));
//        System.out.println();
//        sortedList.forEach(System.out::print);
//        System.out.println();

        List<String> intsAsStrings = ints.stream()
                .filter(i -> i >= 0)
                .sorted()
                .map(i -> i * 10)
                .map(i -> String.valueOf(i))
                .collect(Collectors.toList());


        List<Integer> backToInt = intsAsStrings.stream().map(Integer::new).sorted((o1, o2) -> {
            if (o1 > o2) {
                return -1;
            } else if (o1 < o2) {
                return 1;
            } else {
                return 0;
            }
        }).collect(Collectors.toList());

        backToInt.forEach(System.out::println);

        List<Integer> backToInt2 = intsAsStrings.stream()
                .map(Integer::new).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        backToInt2.forEach(System.out::println);

        Optional<Integer> maxResult = backToInt2.stream().filter(i -> i < 20).max(Comparator.naturalOrder());
        if(maxResult.isPresent()) {
            System.out.println(maxResult.get());
        } else {
            System.out.println("Not present");
        }



//        intsAsString.forEach(i -> System.out.print(i + " "));


    }
}
