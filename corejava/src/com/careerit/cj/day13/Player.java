package com.careerit.cj.day13;

public class Player {
	
	public Player(int num1, int num2, int num3) {
		System.out.println(num1+" "+num2+" "+num3);
	}
	public Player(int num1, int num2) {
		this(num1,num2,30);
		//System.out.println("User defined constructor");
	}
	public Player(int num1) {
		this(num1,10);
	}
/*	public Player(int num1,int num2) {
		System.out.println("user defined constructor");
	}
	public Player(float num1,float num2) {
		System.out.println("user defined constructor");
	}
	public void show() {
		System.out.println("show method");
	}
	*/public static void main(String[] args) {
		Player p1=new Player(10);
		Player p2=new Player(10,20);
		//new Player();
		//p1.show();
	}

}
