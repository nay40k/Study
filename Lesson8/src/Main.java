import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        String str = "Я стану отличным программистом";
//        int len = str.length();
//        System.out.println("Длина строки: " + len + " символов.");
//        String[] s = str.split("\\s");
//        System.out.println("В тексте: " + s.length + " слов.");
//        String newStr = str + ", если буду хорошо учиться";
//        System.out.println("Длина строки: " + newStr.length() + " символов.");
//
//
//        String result = newStr.replace("программистом", "Java-программистом");
//        System.out.println(result);
//
//
//        String s1 = "Cat";
//        String s2 = "Cat";
//        String s3 = new String("Cat");
//        String s4 = s3.intern();
//
//        System.out.println("s1 == s2 :" + (s1 == s2));
//        System.out.println("s1 == s3 :" + (s1 == s3));
//        System.out.println("s1 == s4 :" + (s1 == s4));


//        String str = "Test - string - test";
//        Pattern pattern = Pattern.compile(" +- +");
//        Matcher matcher = pattern.matcher(str);
//
//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.end());
//            System.out.println(matcher.group());
//        }

        String str = "        www.it-academy.by      ";
        Pattern pattern = Pattern.compile("www\\.([\\w-]+)\\.by");
        Matcher matcher = pattern.matcher(str);
        matcher.find();
        System.out.println(matcher.group(1));


    }
}