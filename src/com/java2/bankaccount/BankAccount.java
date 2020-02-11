package com.java2.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checking;
	private double saving;
	private static int numberOfAccounts;
	
	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		this.checking = 0;
		this.saving = 0;
		numberOfAccounts++;
	}
	
	public void deposit(double amount, String accountType) {
		if(accountType.equals("checking")) {
			this.checking += amount;
		} else {
			this.saving += amount;
		}
	}
	
	public void withdraw(double amount, String accountType) {
		if(accountType.equals("checking") && this.checking - amount >= 0) {
			this.checking -= amount;
		} else if (accountType.equals("saving") && this.saving - amount >= 0) {
			this.saving -= amount;
		} else {
			System.out.println("Wrong account or Insufficient Funds");
		}
	}
	
	public void getTotalMoney() {
		System.out.println("Your checking balance is: " + this.checking);
		System.out.println("Your saving balance is: " + this.saving);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getChecking() {
		return checking;
	}

	public double getSaving() {
		return saving;
	}

	
	private String generateAccountNumber() {
		String acc = "";
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			acc += String.valueOf(r.nextInt(10));
		}
		return acc;
	}
	
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	
}
