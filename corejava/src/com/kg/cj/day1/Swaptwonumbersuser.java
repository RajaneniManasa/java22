package com.kg.cj.day1;

import java.util.Scanner;

public class Swaptwonumbersuser {
	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("AFTER SWAPPING N1="+n1+ "and n2="+n2);
		sc.close();
	}
	
}
