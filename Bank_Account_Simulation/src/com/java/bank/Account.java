package com.java.bank;

import java.util.ArrayList;

public class Account {
	private double balance;
	private ArrayList<String> transactionHistory;

	public Account() {
		balance = 0.0;
		transactionHistory = new ArrayList<>();
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactionHistory.add("Deposited: " + amount);
			System.out.println("Amount deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			transactionHistory.add("Withdrawn: " + amount);
			System.out.println("Amount withdrawn successfully.");
		} else {
			System.out.println("Invalid withdraw amount or insufficient balance.");
		}
	}

	public void showBalance() {
		System.out.println("Current Balance: " + balance);
	}

	public void showTransactionHistory() {
		System.out.println("Transaction History:");
		if (transactionHistory.isEmpty()) {
			System.out.println("No transactions yet.");
		} else {
			for (String transaction : transactionHistory) {
				System.out.println(transaction);
			}
		}
	}

}
