package homework4.livelock;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account1 = new BankAccount(1, 1000);
        BankAccount account2 = new BankAccount(2, 1000);

        CountDownLatch start = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            try {
                start.await();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            account1.transfer(account2, 10);
        });

        Thread t2 = new Thread(() -> {
            try {
                start.await();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            account2.transfer(account1, 10);
        });

        t1.start();
        t2.start();
        start.countDown();

        Thread.sleep(3000);

        System.out.println("=== LIVELOCK ===");
        System.out.println("t1 alive: " + t1.isAlive() + ", state: " + t1.getState());
        System.out.println("t2 alive: " + t2.isAlive() + ", state: " + t2.getState());

        System.out.println("A=" + account1.getBalance() + ", B=" + account2.getBalance());

        System.exit(0);
    }
}
