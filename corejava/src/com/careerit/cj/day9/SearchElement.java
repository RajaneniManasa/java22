package com.careerit.cj.day9;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class SearchElement {
public static void main(String[] args) {
	int[] arr=new int[10];
	for(int i=0;i<arr.length;i++) {
		arr[i]=ThreadLocalRandom.current().nextInt(1,21);
	}
	System.out.println("guess a number between 1-20");
	Scanner sc=new Scanner(System.in);
	int gnum=sc.nextInt();
	boolean flag=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==gnum) {
			flag=true;
			break;
		}
	}if(flag) {
		System.out.println("congrats you guessed number");
	}else {
		System.out.println("Sorry try again");
		System.out.println(Arrays.toString(arr));
	}sc.close();
}
}
