package com.careerit.cj.day6;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		boolean flag = isPrime(num);
		if(flag) {
			System.out.println(num+"is  prime");
		}else {
			System.out.println(num+"is not prime");
		}sc.close();
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		if(num%2==0 && num!=2) {
			return false;
		}
for(int i=2;i<=num/2;i++) {
	if(num%i==0) {
		return false;
	}
}
return true;
}
}