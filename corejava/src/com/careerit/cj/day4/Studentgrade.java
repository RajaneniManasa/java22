package com.careerit.cj.day4;

import java.util.Scanner;

public class Studentgrade {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("enter marks");
	int marks=sc.nextInt();
	if(marks>=8 && marks<=10) {
		System.out.println("congratulations" +name+"your grade is A");
	}else if(marks>=6 && marks<=7) {
		System.out.println(name+"your grade is B");
	}else if(marks>=4 && marks<=5) {
		System.out.println(name+"your grade is C");
	}else if(marks<=4) {
		System.out.println("your grade is D");
	}else {
		System.out.println("your have entered wrong input");
	}
	sc.close();
	}
}
