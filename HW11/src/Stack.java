import java.util.Arrays;

public class Stack<T> {
    private T[] array;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked") // если честно, Idea подсказала это вставить, а я и не стал спорить
    public Stack(int initialCapacity) {
        capacity = initialCapacity;
        array = (T[]) new Object[capacity];
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
//    public T peek() {
//        if (isEmpty()) {
//            System.out.println("Array is empty");
//        }
//        return array[size - 1];
//    }
    
    public void push(T value) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size++] = value;
    }

    public T pop() {

        if (isEmpty()) {
            System.out.println("Array is empty");
        }
        array[size] = null;
        return array[--size];
    }

    @SuppressWarnings("unchecked")
    void increaseCapacity() {
        capacity = capacity * 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }


}
