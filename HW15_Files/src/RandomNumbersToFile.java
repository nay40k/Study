import java.io.*;
import java.util.Random;

public class RandomNumbersToFile {

    public static void main(String[] args) {

        String fileName = "randomNumbers.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Random random = new Random();
            for (int i = 0; i < 30; i++) {
                int randomNumber = 1 + random.nextInt(100);
                dos.writeInt(randomNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int sum = 0;
            int count = 1;
            while (dis.available() > 0) {
                int number = dis.readInt();
                System.out.println("Число " + count +  ": "  + number);
                sum += number;
                count++;
            }

            if (count > 1) {
                double average = (double) sum / (count - 1);
                System.out.println("Среднее арифметическое: " + average);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
