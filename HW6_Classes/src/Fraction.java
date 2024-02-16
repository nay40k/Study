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
        int resultNumerator = (int) (this.numerator * number * 100);
        return new Fraction(resultNumerator, this.denominator * 100);
    }

    public Fraction divide(double number) {
        int resultDenominator = (int) (this.denominator * number * 100);
        return new Fraction(this.numerator * 100, resultDenominator);
    }
}