package com.bridgeit.amit.util;

import java.util.Scanner;

import com.bridgeit.amit.programs.Customer;

public class utility 
{
	Scanner scn = new Scanner(System.in);
	
	public String inputString(){
		return scn.next();
	}
	
	public double inputDouble(){
		return scn.nextDouble();
	}
	
	public int inputInt(){
		return scn.nextInt();
	}
	
	
}
