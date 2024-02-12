/*
Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
Конструктор класса должен инициализировать их заданным набором значений;
Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
Mетод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
Метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат умножения;
Метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.
 */

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public String toString() {
        return numerator + " / " + denominator;
    }

    public Fraction sum(Fraction otherFraction) {
        int resultNumerator = this.numerator * otherFraction.denominator + otherFraction.numerator * this.denominator;
        int resultDenominator = this.denominator * otherFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multiply(double number) {
        int resultNumerator = (int) (this.numerator * number);
        return new Fraction(resultNumerator, this.denominator);
    }

    public Fraction divide(double number) {
        int resultDenominator = (int) (this.denominator * number);
        return new Fraction(this.numerator, resultDenominator);
    }
}