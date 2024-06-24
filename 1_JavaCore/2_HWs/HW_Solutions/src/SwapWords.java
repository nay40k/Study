public class SwapWords {

    public static void main(String[] args) {
        String text = "Пример текста с разными словаммммммммммммми для проверки и работы Пупы и программы и";
        System.out.println("Исходный текст: " + text);
        String swappedText = swapLongestAndLastShortestWord(text);
        System.out.println("Измененный текст: " + swappedText);
    }

    public static String swapLongestAndLastShortestWord(String text) {
        String[] words = text.split("\\s+");
        int longestWordIndex = 0;
        int shortestWordIndex = 0;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

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

        // Поменять местами слова
        String temp = words[longestWordIndex];
        words[longestWordIndex] = words[shortestWordIndex];
        words[shortestWordIndex] = temp;

        // Собрать обратно текст
        return String.join(" ", words);
    }
}
