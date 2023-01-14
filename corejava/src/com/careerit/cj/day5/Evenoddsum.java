package com.careerit.cj.day5;

import java.util.Scanner;

public class Evenoddsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int esum=0;
		int osum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				esum=esum+i;
			}else {
				osum=osum+i;
			}
		}
		System.out.println(esum);
		System.out.println(osum);
		sc.close();
}
}