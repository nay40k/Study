
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

/*
  1. Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.
*/

        String input = "abcscannertest";

        if (input.startsWith("abc")) {
            input = input.replaceFirst("abc", "www");
        } else {
            input += "zzz";
        }

        System.out.println("Результат: " + input);

/*
  2. Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
  Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.
*/

        String newInput = "          Баба Яга       ходила    за     куриными     ногами                ";
        String normalizedString = newInput.trim().replaceAll("\\s+", " ");
        System.out.println("Нормированный вид: \n" + normalizedString);

    }
}