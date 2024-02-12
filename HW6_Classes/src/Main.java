public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Fraction
        Fraction fractionOne = new Fraction(3, 7);
        Fraction fractionTwo = new Fraction(5, 11);

        // Вывод дробей в текстовую строку
        System.out.println(fractionOne);  // Output: 1 / 2
        System.out.println(fractionTwo);  // Output: 3 / 4

        // Сложение дробей
        Fraction result = fractionOne.sum(fractionTwo);
        System.out.println(result);  // Output: 5 / 4

        // Умножение дроби на число
        result = fractionOne.multiply(2.5);
        System.out.println(result);  // Output: 5 / 4

        // Деление дроби на число
        result = fractionOne.divide(0.5);
        System.out.println(result);  // Output: 1 / 1
    }
}