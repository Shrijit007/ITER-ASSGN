//Q8
abstract class Account {
    private String accountNumber;
    protected double balance;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Deposited $" + amount+".");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount+".");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ".");
    }

    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ".");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SAV123", 1000, 5.0);
        Account current = new CurrentAccount("CUR456", 500, 200);

        System.out.println("Savings Account Transactions:");
        savings.deposit(500);
        savings.withdraw(200);
        savings.withdraw(2000); 
        savings.displayAccountInfo();

        System.out.println("\nCurrent Account Transactions:");
        current.deposit(300);
        current.withdraw(700); 
        current.withdraw(500); 
        current.displayAccountInfo();
    }
}
