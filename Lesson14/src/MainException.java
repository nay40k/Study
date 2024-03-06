import java.util.Scanner;

class MainException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int result;

        while (true) {
            System.out.print("Введите число:\n");
            userNumber = scanner.nextInt();
            try {
//                if (userNumber == 0) {
//                    throw new RuntimeException("Получен 0");
//                }

                result = 100 / userNumber;
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя. Попробуйте ещё раз.");
                continue;
            } catch (RuntimeException ex) {
                System.out.println("Что-то пошло не так. " + ex.getMessage());
                continue;
            }
            break;
        }

        System.out.println("100 / " + userNumber + " = " + result);
    }
}
