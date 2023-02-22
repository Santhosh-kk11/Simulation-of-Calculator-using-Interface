package com.tt;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);

		while(true) {
			System.out.println("1:add /n 2:sub /n 3:mul /n 4:div /n 5:exit ");
			System.out.println("enter your choice");
			int choice=ip.nextInt();
			
			int a=0;
			int b=0;
			if(choice>=1 && choice <=5) {
			
			
			
			Calculator c=new Calculator_implimentation();
			switch (choice) {
			case 1:
				System.out.println("enter the a value");
				 a=ip.nextInt();
				System.out.println("enter the b value");
				 b=ip.nextInt();
				System.out.println("sum of two numbers is:");
				System.out.println(c.add(a, b));
				System.out.println("*******************************************");
				break;

			case 2:
				System.out.println("enter the a value");
				 a=ip.nextInt();
				System.out.println("enter the b value");
				 b=ip.nextInt();
				System.out.println("product of two numbers is");
				System.out.println(c.sub(a, b));
				System.out.println("*******************************************");
				break;

			case 3:
				System.out.println("enter the a value");
				 a=ip.nextInt();
				System.out.println("enter the b value");
				 b=ip.nextInt();
				int result=c.mul(a, b);
				if(result!=0) {
				System.out.println(c.mul(a, b));
				}
				else {
					System.out.println("dont pass zero as values");
				}
				System.out.println("*******************************************");
				break;

			case 4:
				System.out.println("enter the a value");
				 a=ip.nextInt();
				System.out.println("enter the b value");
				 b=ip.nextInt();
				try {
				System.out.println(c.div(a, b));
				}
				catch(Exception e) {
					System.out.println("invalid denominator do not divide it by zero");
				}
				System.out.println("*******************************************");
				break;

			case 5:
				System.out.println("<<<<<<<<<<<---THANK YOU--->>>>>>>>>>>");
				System.exit(0);
				
				break;

			
			}

		}
			else
			{
				System.out.println("invalid choice");
			}

	}

}

}
