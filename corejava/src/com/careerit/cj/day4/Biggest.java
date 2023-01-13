package com.careerit.cj.day4;

import java.util.Scanner;

public class Biggest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n1");
	int n1=sc.nextInt();
	System.out.println("enter n2");
	int n2=sc.nextInt();
	System.out.println("enter n3");
	int n3=sc.nextInt();
	if(n1==n2 && n2==n3 && n1==n3) {
		System.out.println("all are same");
	}
	else if(n1>n2 && n1>n3) {
		System.out.println("n1 is bigger");
	
	}else if(n2>n3){
		System.out.println("n2 is bigger");
	}else {
		System.out.println("n3 is bigger");
	}sc.close();
}
}
