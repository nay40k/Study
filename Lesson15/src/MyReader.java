import java.io.FileReader;
import java.io.IOException;

public class MyReader {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("sample.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
