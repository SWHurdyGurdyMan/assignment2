package com.meritamerica.assignment2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount = null;
	private SavingsAccount savingsAccount = null;
	double savingsBalance;
	double checkingBalance;
	double CDBalance;
	double combinedBalance;
	CDAccount CDAccount;
	ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
	ArrayList<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
	ArrayList<CDAccount> CDAccounts = new ArrayList<CDAccount>();
	
	//blueprint for an AccountHolder's info, works when an object of the AccountHolder class is created	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount ch = new CheckingAccount(openingBalance);
		checkingAccounts.add(ch);
		return ch;
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		checkingAccounts.add(checkingAccount);
		return checkingAccount;
	}
	
	public ArrayList<CheckingAccount> getCheckingAccounts() {
		return checkingAccounts;
	}
	
	int getNumberOfCheckingAccounts() {
		return checkingAccounts.size();
	}
	
	double getCheckingBalance() {
		CheckingAccount ch = new CheckingAccount(checkingBalance);
		checkingBalance = 1000;
		return checkingBalance;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount sh = new SavingsAccount(openingBalance);
		return sh;
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		savingsAccounts.add(savingsAccount);
		return savingsAccount;
	}
	
	public ArrayList<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}
	
	int getNumberOfsavingsAccounts() {
		return savingsAccounts.size();
	}
	
	double getSavingsBalance() {
		savingsBalance = 10000;
		return savingsBalance;
	}
	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cd = new CDAccount(offering, openingBalance);
		return CDAccount;
	}
	
	CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccounts.add(cdAccount);
		return CDAccount;
	}
	
	CDAccount[] getCDAccounts() {
		CDAccount[] CDAccount = CDAccounts.toArray(new CDAccount[0]);
		return CDAccount;
	}
	
	int getNumberOfCDAccounts() {
		return CDAccounts.size();
	}
	
	double getCDBalance() {
		return CDBalance;
	}
	
	double getCombinedBalance() {
		combinedBalance = savingsBalance + checkingBalance;
		return combinedBalance;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.##");
		return "Name: " + firstName + " " + middleName + " " + lastName +
				"\n SSN: " + ssn +
				"\n Checking Account Balance: $" + df.format(checkingAccount.getBalance()) +
				"\n Checking Account Interest Rate: " + checkingAccount.getInterestRate() +
				"\n Checking Account Balance in 3 years: $" + df.format(checkingAccount.futureValue(3)) +
				"\n Savings Account Balance : $" + df.format(savingsAccount.getBalance()) +
				"\n Savings Account Interest Rate: " + savingsAccount.getInterestRate() +
				"\n Savings Account Balance in 3 years: $" + df.format(savingsAccount.futureValue(3));
		
	}
}