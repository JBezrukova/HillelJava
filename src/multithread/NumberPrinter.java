package multithread;

/**
 * Created by Юля on 29.04.2016.
 */
public class NumberPrinter implements Runnable{

    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
                currentThread.interrupt();
            }

            String name = currentThread.getName();
            System.out.println(name + " " + i);

            if (currentThread.isInterrupted()){
                return;
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


