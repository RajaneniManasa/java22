package com.careerit.cj.day3;

import java.util.Scanner;

public class DiscountWithIfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill");
		float bill=sc.nextFloat();
		System.out.println("Bill amount is"+bill);
		float net_amount,total_discount;
		if(bill>=1000) {
			System.out.println("You got 10% discount on bill");
			total_discount=(bill*10)/100;
			net_amount=bill-total_discount;
			System.out.println("Final amount after discount"+net_amount);
		}
		else {
			total_discount=(bill*5)/100;
			net_amount=bill-total_discount;
			System.out.println(" Total amount is"+net_amount);
		}sc.close();
	}

}

