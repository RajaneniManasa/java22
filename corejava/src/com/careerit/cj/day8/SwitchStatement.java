package com.careerit.cj.day8;

import java.util.Scanner;

public class SwitchStatement {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	boolean flag=true;
	while(flag) {
		System.out.println("1. withdraw 2.deposit 3. balance 4. exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: withDraw();
			break;
		case 2: Deposit();
			break;
		case 3: showBalance();
			break;
		case 4: sc.close();
		System.exit(0);
		default:
			System.out.println("please enter valid value1-4");
		}
		sc.nextLine();
		System.out.println("Do you want to continue..yes/no");
		String response=sc.nextLine();
		if(!response.equals("yes")) {
			flag=false;
		}
	}
		
}

public static void withDraw() {
	System.out.println("Withdraw method is called");
}
public static void Deposit() {
	System.out.println("Deposit method is called");
}
public static void showBalance() {
	System.out.println("showBalance method is called");
}
	
	
	
}

