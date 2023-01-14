package com.careerit.cj.day5;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
		}System.out.println(n+"has"+count);
		if(count==2) {
			System.out.println("it is prime");
		}
		sc.close();
}
}