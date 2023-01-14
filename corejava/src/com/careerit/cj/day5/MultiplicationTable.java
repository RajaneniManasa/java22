package com.careerit.cj.day5;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m;
		for(int i=1;i<=10;i++) {
			m=n*i;
			System.out.println(n+"*"+i+"="+m);
		}
}
}