package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class CheckingAccount {
	
	//establish interest, FV=Future Value, years, and balance
	private double balance;
	private double interestRate;
	private double FV;
	private int years;

	//sets initial balance, interest rate, and years in which interest is accrued
	public CheckingAccount (double checkingAccountOpeningBalance, int years) {
		this.balance = checkingAccountOpeningBalance;
		this.interestRate =  0.0001;
		this.years = 3;
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
			System.out.println("Withdrawn: $" + amount + "Checking balance: $" + balance);
			return true;
		} else {
			System.out.println("You cannot withdraw $" + amount +" which is more than your balance of $" + balance);
			return false;
		}
	}
	//deposit method, adds deposit amount to balance
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("\nDeposited: $" + amount + "\nChecking balance: $" + balance);
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
	//turns account balance, interest, and FV to formatted String
	public String toString() {
		double FV = futureValue(years);
		DecimalFormat df = new DecimalFormat("0.##");
		return "\nChecking Account Balance: " + df.format(balance) + 
				"\n Checking Account Interest Rate: " + interestRate +
				"\n Checking Account Balance in " + years + " years: " + df.format(FV);
	}
}