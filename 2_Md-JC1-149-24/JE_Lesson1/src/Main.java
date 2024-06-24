import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "Примертекста, самоедлинноеслово: 12345678901. С цифрами 123456789012 и знаками препинания!";
        System.out.println("Исходный текст: " + text);

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }
        System.out.println("Количество цифр в строке: " + count);
    }
}