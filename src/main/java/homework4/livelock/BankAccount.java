package homework4.livelock;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class BankAccount {
    private final int id;
    private int balance;

    private static final AtomicBoolean yielding = new AtomicBoolean(false);

    public BankAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void transfer(BankAccount target, int amount) {
        while (true) {
            if (yielding.get()) {
                Thread.yield();
                continue;
            }

            if (yielding.compareAndSet(false, true)) {
                while (yielding.get()) {
                    Thread.yield();
                }
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return id == that.id && balance == that.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }
}
