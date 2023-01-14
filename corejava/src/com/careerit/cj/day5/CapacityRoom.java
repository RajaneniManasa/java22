package com.careerit.cj.day5;

import java.util.Scanner;

public class CapacityRoom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of students");
		int students=sc.nextInt();
		System.out.println("Enter the room capacity");
		int capacity=sc.nextInt();
		int r;
		if(students%capacity==0) {
			r=students/capacity;
			System.out.println(r);
		}else {
			r=(students/capacity)+1;
			System.out.println(r);
		}sc.close();
		

}
}
