public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public Fraction sum(Fraction fraction) {
        int resultNumerator = this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator;
        int resultDenominator = this.denominator * fraction.getDenominator();
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