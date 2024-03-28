package task2;

class MinFinder extends Thread {
    private int[] array;
    private int min;

    public MinFinder(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
    }

    public int getMin() {
        return min;
    }
}