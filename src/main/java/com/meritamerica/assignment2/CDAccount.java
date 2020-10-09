package com.meritamerica.assignment1;
import java.util.*;
public class CDAccount {
	CDOffering offering;
	double balance;
	double interestRate;
	int term;
	long accountNumber;
	double futureValue;
	
	public CDAccount(CDOffering offering, double balance) {
		this.offering = offering;
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public int getTerm() {
		return this.term;
	}
	public Date getStartDate() {
		Date startDate = new Date();
		return startDate;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public double futureValue() {
		return this.futureValue;
	}
}