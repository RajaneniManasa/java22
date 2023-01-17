package com.careerit.cj.day12;

public class Account {
	private String accNumber;
	private String name;
	private double balance;
	public Account(String accNumber,String name,double balance) {
		this.accNumber=accNumber;
		this.name=name;
		this.balance=balance;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("After withdraw of "+amount+"account has balance"+balance);
		}else {
			System.out.println("dear"+name+"you dont have sufficient funds");
		}
	}public void deposit(double amount) {
		balance+=amount;
		System.out.println("after deposit of"+amount+"account has balance"+balance);

}public void showBalance() {
	System.out.println("account"+accNumber+"has balance"+balance);
}
public void showAccountInfo() {
	System.out.println("account number"+accNumber);
	System.out.println("Name"+name);
	System.out.println("balance"+balance);
}
}