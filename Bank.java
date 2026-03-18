package Bankproject;

import java.util.List;

public class Bank {
	private String name;
	private List<Customer>customers;
	
	public Bank(String name,List<Customer>customers ) {
		this.name=name;
		this.customers=customers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void printCustomers() {
		for(Customer c:customers) {
			System.out.println(c);
		}
	}
	

	
}
