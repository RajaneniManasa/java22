package com.careerit.cj.day11;

public class PersonalDetails {

	public static void main(String[] args) {
		String data="1234567890-Krish-35000,1234568891-Manoj-55000";
		for(String arr:data.split(",")) {
			showDetails(arr);
		}
	}
	public static void showDetails(String arr) {
		String[] dataArr = arr.split("-");
		String accNumber=dataArr[0];
		String name=dataArr[1];
		double balance = Double.parseDouble(dataArr[2]);
		System.out.println("acc number:"+maskAccountNumber(accNumber));
		System.out.println("Name :"+name);
		System.out.println("balance:"+balance);
		//System.out.println("-".repeat(30));
	}
	public static String maskAccountNumber(String accNum) {
		return "*********"+accNum.substring(accNum.length()-4);
	}
}
