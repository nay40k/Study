import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MergeFiles {
    public static void main(String[] args) {

        Random random = new Random();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("in1.txt"))) {
            for (int i = 0; i < 1000; i++) {
                bw.write(random.nextInt(100000) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("in2.txt"))) {
            for (int i = 0; i < 1000; i++) {
                bw.write(random.nextInt(100000) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> bufList = new ArrayList<>(2000);

        try (BufferedReader br = new BufferedReader(new FileReader("in1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bufList.add(Integer.valueOf(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("in2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bufList.add(Integer.valueOf(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(bufList);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            for (int line : bufList) {
                bw.write(line + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // для вывода отсортированного файла раскомментировать строки ниже этой
        // try (BufferedReader br = new BufferedReader(new FileReader("out.txt"))) {
        //     String line;
        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


    }
}