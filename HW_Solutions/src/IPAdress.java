import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdress {
    public static void main(String[] args) {
        String ipAddress = "192.168.0.1";

        String regex = "^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("IP-адрес " + ipAddress + " является корректным.");
        } else {
            System.out.println("IP-адрес " + ipAddress + " не является корректным.");
        }
    }
}