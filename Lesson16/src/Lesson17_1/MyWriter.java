package Lesson17_1;

public class MyWriter extends Thread {

    private final String[] chars;

    public MyWriter(String[] chars) {
        this.chars = chars;
    }

    @Override
    public void run() {

        while (chars[chars.length - 1] == null) {
            synchronized (chars) {
                for (int i = 1; i < chars.length; i++) {
                    if (chars[i] == null) {
                        char currentChar = chars[i - 1].toCharArray()[0];
                        char nextChar = (char) (currentChar + 1);
                        chars[i] = String.valueOf(nextChar);
                        System.out.println("Поток " + this.getName() + " записал " + chars[i]);
                        break;
                    }

                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }



}
