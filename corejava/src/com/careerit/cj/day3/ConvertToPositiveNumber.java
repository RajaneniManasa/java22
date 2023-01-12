package com.careerit.cj.day3;

import java.util.Scanner;

public class ConvertToPositiveNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if (age>0) {
			age++;
			System.out.println("Entered age with increment by 1 is"+age);
		}else {
			age=-age;
			age++;
			System.out.println("Entered age is coverted to positive and with increment by 1 is"+ age);
		}sc.close();
	}
}
