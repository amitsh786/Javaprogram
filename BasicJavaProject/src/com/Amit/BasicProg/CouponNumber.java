package com.Amit.BasicProg;

import java.util.Scanner;

import com.Amit.ProgramUtility.Utility;

public class CouponNumber 
{
	public static void main(String[] args) {
		Utility ul = new Utility();
		Scanner scn = new Scanner(System.in); // this is used to take the
												// dynamic value from the user
		System.out.println(" hello Good morning sir ");
		System.out.println("Plz say your good name");
		String goodname=scn.nextLine();
		System.out.println("so"+" "+goodname+" "+"you want to generate the unique coupon number ");
		System.out.println("please enter how much coupon number you want");
		int number=scn.nextInt();
		ul.couponGenerator(number);
}
}
