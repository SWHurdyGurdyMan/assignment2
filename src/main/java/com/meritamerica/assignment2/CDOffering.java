package com.meritamerica.assignment2;

public class CDOffering {
	private int term;
	private double interestRate;
	private double[] CDInterest = {1.8, 1.9, 2.0, 0, 0, 2.5, 0, 0, 0, 0, 0, 2.2};
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate= CDInterest[this.term];
	}
	public int getTerm() {
		return this.term;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
}
