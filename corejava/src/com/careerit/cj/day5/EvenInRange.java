package com.careerit.cj.day5;

import java.util.Scanner;

public class EvenInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a lb number");
		int n=sc.nextInt();
		System.out.println("Enter a ub number");
		int m=sc.nextInt();
		for(int i=n;i<=m;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
}sc.close();
}
}