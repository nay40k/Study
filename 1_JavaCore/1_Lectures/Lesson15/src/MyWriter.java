import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("sample.txt");
            fileWriter.write("Hello students");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ignored) {}
            }
        }
    }
}