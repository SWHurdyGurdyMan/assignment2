package com.meritamerica.assignment1;

//string out everything into the banking app between two parties


public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		//Create new object of AccountHolder Class, DoreM
		AccountHolder DoreM = new AccountHolder(
				"Dore",
				"",
				"Mendoza",
				"999999999",
				100.0,
				1000.0);
		//Prints AccountHolder info as String
		System.out.println(DoreM.toString());
		//passes checking account balance and if deposit > 0 it is added to balance
		DoreM.getCheckingAccount().deposit(500);
		//passes savings balance and if withdrawal > 0 && withdrawal <= balance withdraws properly
		DoreM.getSavingsAccount().withdraw(800);
		//prints savings and checking info as String using toString in those classes
		System.out.println(DoreM.getCheckingAccount().toString());
		System.out.println(DoreM.getSavingsAccount().toString());
		
		//Shelby
		AccountHolder ShelbyW = new AccountHolder(
				"Shelby",
				"Eugene",
				"Walles",
				"123456789",
				200.0,
				500.0);
		System.out.println(ShelbyW.toString());
		ShelbyW.getCheckingAccount().deposit(-500);
		ShelbyW.getSavingsAccount().withdraw(600);
		System.out.println(ShelbyW.toString());
		System.out.println(ShelbyW.getCheckingAccount().toString());
		System.out.println(ShelbyW.getSavingsAccount().toString());
	}

}