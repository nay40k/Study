package task3;

public class ArrayWriter extends Thread {

    int[] ints;
    int first;

    public ArrayWriter(int[] ints, int first) {
        this.ints = ints;
        this.first = first;
    }

    @Override
    public void run() {

        for (int i = 0; i < ints.length; i++) {
            ints[i] = first++;

        }
    }
}
