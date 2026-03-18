package Bankproject;

public class Transaction {

	private String type; // "deposit", "withdraw", "transfer"
    private double amount;
    private String date;
    private double balanceAfter;
    
    public Transaction(String type, double amount, String date,double balanceAfter) {
    	this.type = type;
    	this.amount = amount;
    	this.date = date;
    	this.balanceAfter = balanceAfter;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [type= " + type + ", amount= £" + amount + ", date= " + date + ", balanceAfter= £" + balanceAfter
				+ "]";
	}
	

}
