package com.careerit.cj.day3;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if( num >0 & num%2==0) {
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
		sc.close();
	}
	
}
