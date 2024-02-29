package iterator2D;

public class ArrayIterator2D<T> implements Iterator<T> {
    private final T[][] array;

    private int row = 0;
    private int index = 0;

    public ArrayIterator2D(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (row < array.length && index < array[row].length) {
            return true;
        }
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
    public T next() {
        if (!hasNext()) {
            System.out.println("Неожиданный конец массива");
        }
        T value = array[row][index++];
        if (index >= array[row].length) {
            row++;
            index = 0;
        }
        return value;
    }

}