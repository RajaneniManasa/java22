package com.careerit.cj.day3;

import java.util.Scanner;

public class DiscountCalcijava {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill");
		float bill=sc.nextFloat();
		System.out.println("Bill amount is"+bill);
		if(bill>=5000) {
			System.out.println("You got 10% discount on bill");
			float net_amount,total_discount;
			total_discount=(bill*10)/100;
			net_amount=bill-total_discount;
			System.out.println("Final amount after discount"+net_amount);
		}
		else {
			System.out.println("No discount and Total amount is"+bill);
		}sc.close();
	}

}
