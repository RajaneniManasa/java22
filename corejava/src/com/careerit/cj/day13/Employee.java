package com.careerit.cj.day13;

import java.util.concurrent.ThreadLocalRandom;

public class Employee {
	private int empno;
	private String name;
	private double salary;
	
	public Employee(int empno,String name,double salary) {
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	} 
	public Employee(String name,double salary) {
		this(ThreadLocalRandom.current().nextInt(1001,10000),name,salary);
	}
	/*	public void setValues(int empno, String name,double salary) {
			this.empno=empno;
			this.name=name;
			this.salary=salary;
		}
	*/
	
	public void showDetails() {
		System.out.println("empno:"+empno);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}

}
