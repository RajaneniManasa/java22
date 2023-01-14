package com.careerit.cj.day5;

import java.util.Scanner;

public class Naturalsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m;
		m=(n*(n+1))/2;
		System.out.println(m);
		sc.close();
}
}