package com.careerit.cj.day11;

public class ImmutableStringExample {
	public static void main(String[] args) {
		String s1="core";
		s1.concat("java");
		System.out.println(s1);
		System.out.println(s1.concat("java"));
	}
}
