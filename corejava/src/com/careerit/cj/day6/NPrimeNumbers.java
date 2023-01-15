package com.careerit.cj.day6;

import java.util.Scanner;

public class NPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter LB number");
		int lb=sc.nextInt();
		System.out.println("enter UB number");
		int ub=sc.nextInt();
		for(int i=lb;i<=ub;i++) {
			boolean flag = isPrime(i);
			if(flag) {
				System.out.println(i+" ");
			}
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