/*
 4. RegEx. Email.
 Общий вид — логин@поддомен.домен.
 Логин, как и поддомен — слова из букв, цифр, подчеркиваний, дефисов и точек. А домен (имеется в виду 1го уровня) — это от 2 до 6 букв.
 Пример: myemail@gmail.com  a.petrov@gmail.com.au coder4575@yandex.ru
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String email = "coder.4575@yandex.subdomen.domain";

        String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email " + email + " является корректным.");
        } else {
            System.out.println("Email " + email + " не является корректным.");
        }
    }
}
