package com.careerit.cj.day11;

import java.util.Scanner;

public class PalindromeCheck {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String data=sc.nextLine();
	if(isPalindrome(data)) {
		System.out.println(data+"is palindrome");
	}else {
		System.out.println("Not a palindrome");
	}
	sc.close();
}
public static boolean isPalindrome(String str) {
	boolean flag=true;
	for(int i=0,j=str.length()-1;i<=j;i++,j--) {
		if(str.charAt(i)!=str.charAt(j)) {
			flag=false;
			break;
		}
	}return flag;
}
}
