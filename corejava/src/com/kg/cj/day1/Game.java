package com.kg.cj.day1;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Game {
		public static void main(String[] args) {
			
			System.out.println("Can you guess the number");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int gnum = ThreadLocalRandom.current().nextInt(1,6);
			//System.out.println(gnum);
			if (num==gnum)
			{
				System.out.println("Congratulations");
			}
			else {
				System.out.println("You lost");
			}
			sc.close();
		}
		
}