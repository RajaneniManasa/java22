package com.careerit.cj.day12;

public class AccountManager {
public static void main(String[] args) {
	Account acc1=new Account("SB-1234567890","KRISH",56000);
	acc1.showAccountInfo();
	acc1.withdraw(6000);
	acc1.showBalance();
}
}
