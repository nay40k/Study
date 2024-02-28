/*
Реализовать класс pair.Pair, который будет содержать
 2 значения (два поля) любого типа (оба поля одного типа). Класс умеет выводить:
     ○    first() - возвращает 1ый элемент
     ○    last() - возвращает 2ой элемент
     ○    swap() - меняет элементы местами
     ○    replaceFirst() - заменяет 1ый элемент на новый
     ○    replaceLast() - заменяет 2ой элемент на новый
*/
package pair;

public class Main {
    public static void main(String[] args) {

        Pair<Integer> numberPair = new Pair<>(1, 2);
        System.out.println("First: " + numberPair.first());
        System.out.println("Last: " + numberPair.last());

        numberPair.swap();
        System.out.println("After swap: " + numberPair);

        numberPair.replaceFirst(10);
        System.out.println("After replaceFirst: " + numberPair);

        numberPair.replaceLast(20);
        System.out.println("After replaceLast: " + numberPair);

        Pair<String> stringPair = new Pair<>("Hello", "World");
        System.out.println("First: " + stringPair.first());
        System.out.println("Last: " + stringPair.last());

        stringPair.swap();
        System.out.println("After swap: " + stringPair);

        stringPair.replaceFirst("Good bye");
        System.out.println("After replaceFirst: " + stringPair);

        stringPair.replaceLast("Kitty");
        System.out.println("After replaceLast: " + stringPair);

    }
}



