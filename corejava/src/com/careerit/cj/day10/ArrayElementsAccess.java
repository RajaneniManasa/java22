package com.careerit.cj.day10;

public class ArrayElementsAccess {
	public static void main(String[] args) {
		String[] names=new String[] {"Rajesh","Bhnau","Suresh"};
		System.out.println(names.length);
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("using foreach");
		for(String ele:names) {
			System.out.println(ele);
		}
	}
}
