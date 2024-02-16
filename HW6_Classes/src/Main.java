public class Main {
    public static void main(String[] args) {

        Fraction fractionOne = new Fraction(1, 3);
        Fraction fractionTwo = new Fraction(3, 4);

        System.out.println(fractionOne);
        System.out.println(fractionTwo);

        Fraction result = fractionOne.sum(fractionTwo);
        System.out.println(result);

        result = fractionOne.multiply(1.97);
        System.out.println(result);

        result = fractionOne.divide(0.33);
        System.out.println(result);
    }
}