//Написать итератор по массиву (посмотрите interface Iterator).
//Ваш класс должен содержать 2 метода - hasNext() и next()

package iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(numbers);

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

        String[] words = {"hello", "why", "man", "almost"};
        ArrayIterator<String> stringArrayIterator = new ArrayIterator<>(words);

        while (stringArrayIterator.hasNext()) {
            String word = stringArrayIterator.next();
            System.out.println(word);
        }
    }
}