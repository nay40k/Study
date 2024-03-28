package task1;
/*
    Создать класс Generator extends Thread.
    В конструктор класса передается List<Integer>,
 ссылка на который сохраняется в классе.
    В методе run() в list по одному добавляются случайные числа
 и после каждого добавления поток “засыпает” (sleep) на 200 msec.
    В лист должно добавится 100 чисел
*/

import java.util.List;
import java.util.Random;

public class Generator extends Thread {

    private List<Integer> list;

    public Generator(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100);
            synchronized (list) {
                list.add(randomNumber);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}