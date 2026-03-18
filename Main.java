package Bankproject;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Account acc = new Account("ACC001", "John", 1000.0);
		acc.printBalance();
		acc.deposit(500);
		acc.printBalance();
		acc.withdraw(200);
		acc.printBalance();
		acc.withdraw(2000);
		acc.printTransactions();
		
		Account acc1 = new Account("ACC001", "John", 1000.0);
		Account acc2 = new Account("ACC002", "John", 500.0);

		acc1.deposit(500);
		acc1.withdraw(200);
		acc2.deposit(300);

		Customer customer = new Customer("John", "john@email.com", new ArrayList<>());	
		customer.addAccount(acc1);
		customer.addAccount(acc2);
		customer.printAccounts();
		customer.printAllTransactions();
		
		Bank bank = new Bank("AB BANK", new ArrayList<>());
		bank.addCustomer(customer);
		bank.printCustomers();
		
		
	}

	

}
