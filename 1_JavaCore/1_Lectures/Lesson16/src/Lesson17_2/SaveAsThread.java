package Lesson17_2;

import java.io.*;

public class SaveAsThread extends Thread {


    private final int[] ints;
    private String fileName;


    public SaveAsThread(int[] ints, String fileName) throws IOException {

        this.ints = ints;
        this.fileName = fileName;
    }






    @Override
    public void run() {

        synchronized (fileName) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
                for (Integer num : ints) {
                    bw.write(num + " ");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}