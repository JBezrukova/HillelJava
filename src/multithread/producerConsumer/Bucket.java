package multithread.producerConsumer;

/**
 * Created by Юля on 06.05.2016.
 */
public class Bucket {

    private int counter;
    private long number;

    public synchronized void get() {
        while (counter <= 0) {
            //thread is waiting
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter--;
        number++;
        notifyAll();
        check();
    }

    public synchronized void put() {
        while (counter >= 1000) {
            try {
                wait();
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        counter++;
        number++;
        //thread which is waiting becomes thread who is waiting for unlock
        notifyAll();
        check();
    }

    private void check(){
        if (counter < 0 || counter > 1000){
            System.out.println("Error, counter: "+counter);
        }
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "counter=" + counter +
                ", number=" + number +
                '}';
    }
}