package com.Amit.BasicProg;

import java.util.Scanner;

import com.Amit.ProgramUtility.Utility;

public class Gambler {
	
	public static void main(String[] args) {
		Utility ul = new Utility();
		Scanner scn = new Scanner(System.in); // this is used to take the
												// dynamic value from the user
		System.out.println(" hello Good morning sir ");
		System.out.println("Plz say your good name");
		String goodname=scn.nextLine();
		System.out.println("so"+" "+goodname+" "+"welcome to the gambler world");
		System.out.println("please enter the amount you have");
		int amount=scn.nextInt();
		System.out.println("Enter your bet lucky winner number within the range (0-10) ");
		int luckyNumber=scn.nextInt();
		System.out.println("Approx number for how much time you want to play ");
		int noOfTimes=scn.nextInt();
		System.out.println("Approx lastamount until you want to play the game");
		int lastAmount=scn.nextInt();
		
		ul.checkGoal(goodname, amount,luckyNumber,noOfTimes,lastAmount);
		
		
		
		
		
	}
}
