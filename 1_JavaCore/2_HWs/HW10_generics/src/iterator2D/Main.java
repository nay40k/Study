//Написать итератор по массиву (посмотрите interface Iterator).
//Ваш класс должен содержать 2 метода - hasNext() и next()

package iterator2D;

public class Main {
    public static void main(String[] args) {
        Integer[][] numbers = new Integer[][]{
                {1, 2, 3, 4},
                {},
                {5, 6},
                {7, 8, 9, 2, 3, 4, 5, 7}
        };

        ArrayIterator2D<Integer> iterator = new ArrayIterator2D<>(numbers);
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.printf("%d\t", number);
        }
        System.out.println();

        String[][] words = new String[][]{
                {"dog", "cat", "pig"},
                {"cow"},
                {"boy", "sun", "fan"},
                {"tea", "rum"}
        };

        ArrayIterator2D<String> wordsIterator = new ArrayIterator2D<>(words);
        while (wordsIterator.hasNext()) {
            String string = wordsIterator.next();
            System.out.printf("%s\t", string);
        }

    }
}