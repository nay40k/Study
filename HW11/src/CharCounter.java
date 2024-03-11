import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    public static void main(String[] args) {
        String testString = "asdasdaa sdddsdsdsssd";
        Map<Character, Integer> charCountMap = getCharsCount(testString);
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue());
        }
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char k : s.toCharArray()) {
            charCountMap.put(k, charCountMap.getOrDefault(k, 0) + 1);
        }
        return charCountMap;
    }
}
