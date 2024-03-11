import java.util.Arrays;

public class MaxStack {
    private int[] array;
    private int[] maxArray;
    private int size;
    private int maxSize;
    private int capacity;
    private int maxCapacity;

    public MaxStack(int initialCapacity) {
        capacity = initialCapacity;
        array = new int[capacity];
        maxCapacity = capacity;
        maxArray = new int[maxCapacity];
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

        if (maxSize == 0 || (value >= maxArray[maxSize - 1])) {
            if (maxSize == maxCapacity) {
                increaseMaxCapacity();
            }
            maxArray[maxSize++] = value;
        }
    }

    public int max() {
        if (isEmpty()) {
            System.out.println("Stack is empty(max)");
        } else {
            return maxArray[maxSize - 1];
        }
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array) + " " + Arrays.toString(maxArray);
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty(pop)");
        } else {

            int i = array[--size];
            array[size] = 0; //это необязательно т.к всё равно будем обращаться к массиву по индексу size
            if (i == maxArray[maxSize - 1]) {
                maxArray[maxSize - 1] = 0;
                maxSize--;
            }
            return i;
        }
        return 0;
    }

    void increaseCapacity() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    void increaseMaxCapacity() {
        maxCapacity = maxCapacity * 2;
        int[] newMaxArray = new int[maxCapacity];
        System.arraycopy(maxArray, 0, newMaxArray, 0, maxSize);
        maxArray = newMaxArray;
    }

    public int size() {
        return size;
    }
}
