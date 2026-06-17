 import java.util.*;

class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient amount");
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("riya", 1000);

        System.out.println(acc.getName());
        System.out.println(acc.getBalance());

        acc.deposit(2000);
        System.out.println(acc.getBalance());

        acc.withdrawal(1000);
        System.out.println(acc.getBalance());

        acc.setName("ramu");
        System.out.println(acc.getName());
    }
}
