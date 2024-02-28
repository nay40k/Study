package iterator2D;

public class ArrayIterator2D<E> implements Iterator<E> {
    private final E[][] array;

    private int index = 0;
    private int row = 0;

    public ArrayIterator2D(E[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        // Проверяем, есть ли следующий элемент в текущей строке
        if (row < array.length && index < array[row].length) {
            return true;
        }
        // Переходим к следующей строке, если текущая закончилась
        while (row < array.length - 1) {
            row++;
            if (array[row].length > 0) {
                index = 0;
                return true;
            }
        }
        return false;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            System.out.println("Конец массива");
        }
        E value = array[row][index++];
        // Переходим к следующей строке, если текущая закончилась
        if (index >= array[row].length) {
            row++;
            index = 0;
        }
        return value;
    }

}