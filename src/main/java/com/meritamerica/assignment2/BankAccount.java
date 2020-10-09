package com.meritamerica.assignment1;

public class BankAccount {
	private double balance;
	private double interestRate;
	private double FV;
	private int years;
	private long accountNumber;

	//sets initial balance, interest rate
	public BankAccount (double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public BankAccount (long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	//withdrawal method, subtracts withdrawal amount from balance
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("\nWithdrawn: $" + amount + "\nAccount balance: $" + balance);
			return true;
		} else {
			System.out.println("\nYou cannot withdraw $" + amount + " which is more than your balance of $" + balance);
			return false;
		}
	}
	//deposit method, adds deposit amount to balance	
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("\nDeposited: $" + amount + "\nAccount balance: $" + balance);
			return true;
		} else {
			System.out.println("\nYou cannot deposit a negative amount of " + amount + " dollars.");
			return false;
		}
	}
	//calculates interest over x years
	public double futureValue(int years) {
		double value = 0.00;
		this.years = years;
		double powered = Math.pow((1 + interestRate), years);
		value = balance * powered;
		FV = value;
		return FV;
	}
}