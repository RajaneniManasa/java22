package com.careerit.cj.day5;

import java.util.Scanner;

public class Numbercheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0) {
			if(n<100) {
				n=n+10;
				System.out.println("the number..."+n);
			}else {
				n=n+1;
			}
		}else {
			n=n*10;
			System.out.println("number odd..."+n);
		}sc.close();
}
}