public class OutOfRangeException extends Exception{

    public OutOfRangeException(String message) {
        super(message);
        System.out.print("Введённое число вне загаданного диапазона: ");
    }
}