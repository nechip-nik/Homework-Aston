package homework4.deadlock;

import java.util.Objects;

public class BankAccount {
    private final int id;
    private int balance;
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
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void transfer(BankAccount bankAccount, int amount) {
        synchronized (this) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            synchronized (bankAccount) {
                this.balance -= amount;
                bankAccount.balance += amount;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount account = (BankAccount) o;
        return id == account.id && balance == account.balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }
}
