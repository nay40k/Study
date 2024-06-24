/*
  3. Введите строку (текст).
  Найдите наибольшее количество идущих подряд цифр.
  Поменяйте местами первое самое длинное слово с последним самым коротким
  Найти в строке все знаки препинания. Подсчитать общее количество их.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHandler {
    public static void main(String[] args) {
        String text = "Примертекста, самоедлинноеслово: 12345678901. С цифрами 123456789012 и знаками препинания!";
        System.out.println("Исходный текст: " + text);

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        int maxDigitsCount = 0;
        while (matcher.find()) {
            String digits = matcher.group();
            if (digits.length() > maxDigitsCount) {
                maxDigitsCount = digits.length();
            }
        }
        System.out.println("Наибольшее количество идущих подряд цифр: " + maxDigitsCount);

        String[] words = text.split("\\s+");
        int longestWordIndex = 0;
        int shortestWordIndex = 0;
        int maxLength = 0;
        int minLength = text.length();
        System.out.println(text.length());

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                longestWordIndex = i;
            }
            if (length <= minLength) {
                minLength = length;
                shortestWordIndex = i;
            }
        }

        String temp = words[longestWordIndex];
        words[longestWordIndex] = words[shortestWordIndex];
        words[shortestWordIndex] = temp;
        text = String.join(" ", words);
        System.out.println("Текст после замены: " + text);

        pattern = Pattern.compile("\\p{Punct}");
        matcher = pattern.matcher(text);
        int punctuationCount = 0;
        while (matcher.find()) {
            punctuationCount++;
        }
        System.out.println("Общее количество знаков препинания: " + punctuationCount);
    }
}
