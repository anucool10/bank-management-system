package Bankproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
    private String owner;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();
    
    public Account(String accountNumber, String owner, double balance) {
    	this.accountNumber = accountNumber;
    	this.owner = owner;
    	this.balance = balance;
    	
    }

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + "]";
	}
    

	public void deposit(double amount) {
		balance+=amount;
		transactions.add(new Transaction("DEPOSIT", amount, LocalDate.now().toString(),balance));
		System.out.println("Deposited: £"+amount);
	}
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			transactions.add(new Transaction("WITHDRAW", amount, LocalDate.now().toString(), balance));
			System.out.println("Withdrawn: £"+amount);			
		}else {
			System.out.println("Insufficient Funds!");
		}
		
	}
	
	public void printBalance() {
		System.out.println("Balance for "+owner +": £"+balance);
	}

	public void printTransactions() {
	    for(Transaction t : transactions) {
	        System.out.println(t);
	    }
	}
	

}
