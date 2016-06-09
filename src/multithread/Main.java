package multithread;

/**
 * Created by Юля on 29.04.2016.
 */
public class Main {

    public static void main(String[] args) {
        Thread anotherThread  = new Thread(new NumberPrinter());
        anotherThread.start();

        System.out.println("waiting on a second thread");

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        anotherThread.interrupt();

        /**
         **join block the work of a main thread
         */

        try {
            anotherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finish");
    }
}
