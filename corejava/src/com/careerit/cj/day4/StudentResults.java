package com.careerit.cj.day4;

import java.util.Scanner;

public class StudentResults {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		System.out.println("enter sub1 marks");
		int sub1=sc.nextInt();
		System.out.println("enter sub2 marks");
		int sub2=sc.nextInt();
		System.out.println("enter sub3 marks");

		int sub3=sc.nextInt();
		if(sub1>=35 && sub2>=35 && sub3>=35) {
			System.out.println("congratulation"+name+"you passed");
		}else {
			System.out.println("you failed");
		}
		sc.close();
		
	}

}
