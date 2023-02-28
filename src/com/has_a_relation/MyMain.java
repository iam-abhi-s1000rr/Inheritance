package com.has_a_relation;

public class MyMain {

	public static void main(String[] args) {
		Employee emp22=new Employee(101,"Alex",new Address("Pune","Maharashtra"));
		
		Employee emp11=new Employee(102,"John",new Address("Mumbai","Maharashtra"));
		
		System.out.println(emp22);
		System.out.println(emp11);
		
		double num =52458356;
		double num2=12;
		double ans=num/num2;
		System.out.printf("%.01755555555f",ans);
		//num1=10;
		//num=num1+10;
		//num=10+10;
		//num=20;
	};

}
