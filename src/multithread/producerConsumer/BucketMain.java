package multithread.producerConsumer;

/**
 * Created by Юля on 06.05.2016.
 */
public class BucketMain {

    public static void main(String[] args) {

        Bucket bucket = new Bucket();
        Consumer consumer = new Consumer(bucket);
        Producer producer = new Producer(bucket);

        Thread consumerThread = new Thread(consumer);
        Thread producerThread = new Thread(producer);

        consumerThread.start();
        producerThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        consumerThread.interrupt();
        producerThread.interrupt();

        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bucket.toString());
    }
}
