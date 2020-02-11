package com.java2.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount ();
		BankAccount b1 = new BankAccount ();
		BankAccount b2 = new BankAccount ();
		BankAccount b3 = new BankAccount ();
		
		System.out.println(BankAccount.getNumberOfAccounts());
		
		System.out.println(b.getSaving());
		System.out.println(b.getChecking());
		
		b.deposit(200, "checking");
		b.deposit(20, "saving");
		
		System.out.println(b.getSaving());
		System.out.println(b.getChecking());
		
		b.withdraw(50, "checking");
		System.out.println(b.getChecking());
		
		b.getTotalMoney();
	}

}
