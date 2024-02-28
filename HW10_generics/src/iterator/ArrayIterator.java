package iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private final E[] array;
    private int index = 0;

    public ArrayIterator(E[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            System.out.println("Массив закончился");
        }
        return array[index++];
    }


}