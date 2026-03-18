package Bankproject;

import java.util.List;

public class Customer {
	private String name;
    private String email;
    private List<Account> accounts;
    
    public Customer(String name, String email, List<Account> accounts) {
    	this.name = name;
    	this.email = email;
    	this.accounts = accounts;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", accounts=" + accounts + "]";
	}

	public void addAccount(Account account) {
		accounts.add(account);		
		
	}
	public void printAccounts() {
		for(Account a: accounts) {
			System.out.println(a);			
		}	
	
	}
	
	public void printAllTransactions() {
		for(Account a: accounts) {
			a.printTransactions();
		}
	}
	

}
