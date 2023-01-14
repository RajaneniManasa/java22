package com.careerit.cj.day5;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			m=m*i;
			
		}System.out.println(m);
		sc.close();
}
}