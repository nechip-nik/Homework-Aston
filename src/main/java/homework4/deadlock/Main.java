package homework4.deadlock;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 100);
        BankAccount account2 = new BankAccount(2, 100);
        CountDownLatch start = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            try {
                start.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                account1.transfer(account2, 10);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                start.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                account2.transfer(account1, 10);
            }

        });
        t1.start();
        t2.start();
        start.countDown();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        }
        System.out.println("Account 1: " + account1.getBalance() + " Account 2: " + account2.getBalance());
    }
}
