package com.careerit.cj.day14;
import static java.lang.Math.pow;
import static java.time.LocalDateTime.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class StaticKeyword {
	static {
		System.out.println("block 1");
	}
	public static void main(String[] args) {
		out.println(sqrt(16));
		out.println(pow(2, 3));
		out.println(now());
	}

}
