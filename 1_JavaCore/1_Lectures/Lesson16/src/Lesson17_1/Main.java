package Lesson17_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] chars = new String[100];
        chars[0] = "0";

        MyWriter t0 = new MyWriter(chars);
        MyWriter t1 = new MyWriter(chars);
        MyWriter t2 = new MyWriter(chars);

        t0.start();
        t1.start();
        t2.start();

        t0.join();
        System.out.println(Arrays.toString(chars));
    }
}
