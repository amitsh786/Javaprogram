package com.Amit.BasicProg;
import java.util.Scanner;
import com.Amit.ProgramUtility.Utility;
public class LeapYear 
{
public static void main(String[] args) 
{
    Utility ul=new Utility();
   
	Scanner scn=new Scanner(System.in);   //this is used to take the dynamic value from the user
	System.out.println(" hello Good morning sir");
	System.out.println("Plz say your good name");
	String goodname=scn.nextLine();
	System.out.println("so"+" "+goodname+" "+"plz Enter the Year for which you want to know that it is Leap Year or Not");
	int year=scn.nextInt();
	ul.checkLeapYear(year);
}
}
