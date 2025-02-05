package com.csw2.lec1;

public class BankCustomer {
	
	private String name;
	private int acc;
	private double balance;
	private boolean isSavingAcc;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public void setBalance(double balance) {
		if(balance<0) System.err.println("Balance can't be negative.");
		if(isSavingAcc) this.balance = balance + balance*0.01;
		else this.balance = balance;
	}
	public void setAccType(boolean val) {
		isSavingAcc = val;
	}
	

	public String getName() {
		return name;
	}
	public int getAcc() {
		return acc;
	}
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount<0) 
			System.err.println("Deposit fail, amount can't be Negative.");
		else {
			balance += amount;
			System.out.println("Deposit of ₹"+ amount +" succesfull.");
		}
	}

	public void withdraw(double amount) {
		if(amount>balance)
			System.err.println("Withdraw of ₹"+ amount +" fail, Low Balance.");
		else {
			balance -= amount;
			System.out.println("Withdraw of ₹"+ amount +" succesfull.");
		}
		System.out.println("-> Balance: ₹"+balance);
	}

	public String toString() {
		return "[ Account Holder: "+this.name+", Account Number: " +this.acc+", Savings Account: "+ isSavingAcc +", Balance: ₹"+this.balance+" ]";
	}
	

	public static void main(String[] args) {
		BankCustomer user = new BankCustomer();
		user.setName("A");
		user.setAcc(12345);
		user.setAccType(true);
		user.setBalance(1100);
		System.out.println(user);
		user.deposit(100);
		System.out.println("-> Balance: ₹"+user.getBalance());
		user.withdraw(200);
		user.deposit(-100);
		System.out.println("-> Balance: ₹"+user.getBalance());
		user.withdraw(1200);
	}
}

