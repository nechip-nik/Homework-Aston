package homework4.twothreads;

public class TwoThreads {
    private static final Object lock = new Object();
    private static boolean turn = true;
    private static int count = 0;
    private static final int  MAX_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (!turn && count < MAX_COUNT) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    if (count >= MAX_COUNT) {
                        lock.notify();
                        return;
                    }
                    System.out.print("1 ");
                    count++;
                    turn = false;
                    lock.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (turn && count < MAX_COUNT) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    if (count >= MAX_COUNT) {
                        lock.notify();
                        return;
                    }
                    System.out.print("2 ");
                    count++;
                    turn = true;

                    lock.notify();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}