package multithread.bank;

/**
 * Created by Юля on 29.04.2016.
 */
public class Bank {

    private long account1 = 10_000_000;
    private long account2 = 10_000_000;

    public synchronized void transfer(boolean direction, int amount) {
        if (direction) {
            account1 = account1 - amount;
            account2 = account2 + amount;
        } else {
            account1 = account1 + amount;
            account2 = account2 - amount;
        }
    }



    public void check() {
        synchronized (this) {
            if (account2 + account1 != 20_000_000) {
                System.out.println("something wrong");
            }
            System.out.println("Account 1:" + account1 + ", account 2:" + account2);
        }
    }
}

