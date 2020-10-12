package com.meritamerica.assignment2;
import java.util.*;
public class MeritBank {
	static CDOffering CDOffering;
	static double totalBalances;
	static double futureValue;
	static int nextAccountNumber;
	static ArrayList<AccountHolder> accountHolders = new ArrayList<AccountHolder>();
	static ArrayList<CDOffering> cdOfferings = new ArrayList<CDOffering>();
	
	static void addAccountHolder(AccountHolder accountHolder) {
		
	}
	static AccountHolder[] getAccountHolders() {
		AccountHolder[] AccountHolder = accountHolders.toArray(new AccountHolder[0]);
		return AccountHolder;
	}
	static CDOffering[] getCDOfferings() {
		CDOffering[] CDOfferings = cdOfferings.toArray(new CDOffering[0]);
		return CDOfferings;
	}
	static CDOffering getBestCDOffering(double depositAmount) {
		return CDOffering;
	}
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		return CDOffering;
	}
	static void clearCDOfferings() {
		
	}
	static void setCDOfferings(CDOffering[] offerings) {
		offerings = offerings;
	}
	static long getNextAccountNumber() {
		return nextAccountNumber;
	}
	static double totalBalances() {
		return totalBalances;
	}
	static double futureValue(double presentValue, double interestRate, int term) {	
		return futureValue;
	}
}
