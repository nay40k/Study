import java.util.Arrays;

public class MaxStack{
    private int[] array;
    private int[] maxArray;
    private int size;
    private int maxSize;
    private int capacity;

    public MaxStack(int initialCapacity) {
        capacity = initialCapacity;
        array = new int[capacity];
        maxArray = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }


//    public Integer peek() {
//        if (isEmpty()) {
//            System.out.println("Array is empty");
//        }
//        return array[size - 1];
//    }

    public void push(int value) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size++] = value;
        if (maxSize == 0 || (value >= Math.abs(maxArray[maxSize - 1]))) {
//            if (maxSize == maxCapacity) {
//                increaseMaxCapacity();
//            } TODO common method for capacity increase
            maxArray[maxSize++] = value;
        }
    }

    public int max() {
        return maxArray[maxSize - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(array) + " " + Arrays.toString(maxArray);
    }



    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty(pop)");
        }
        int i = array[--size];
        if (i == maxArray[maxSize - 1]) {
            maxArray[maxSize - 1] = 0;
            maxSize--;
        }
        return i;
    }

    // придуиать как разделить capacity и унифицировать метод
    void increaseCapacity() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        int[] newMaxArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        System.arraycopy(maxArray, 0, newMaxArray, 0, size);
        array = newArray;
        maxArray = newMaxArray;
    }

    public int size() {
        return size;
    }
}
