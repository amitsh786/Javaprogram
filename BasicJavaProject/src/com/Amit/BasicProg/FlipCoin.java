package com.Amit.BasicProg;

import java.util.Scanner;

import com.Amit.ProgramUtility.Utility;

public class FlipCoin 
{
	 public static void main(String[] args) 
	 {
		 Utility ul=new Utility();
		 
		Scanner scn=new Scanner(System.in);   //this is used to take the dynamic value from the user
		System.out.println(" hello Good morning sir");
		System.out.println("Plz say your good name");
		String goodname=scn.nextLine();
		System.out.println("so"+" "+goodname+" "+"how many time you want to flip the coin");
		int fliptime=scn.nextInt();

		ul.countofheadandtail(fliptime);// method calling to find the count of head and tail
		System.out.println("Thanku"+" "+goodname+" "+"for playing with us");
		
	 }// closeof the main method 
}
