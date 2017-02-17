package com.Amit.BasicProg;

import java.util.Scanner;

public class removespace 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter String you want");
		String s1=scn.nextLine();
		char ch[]=s1.toCharArray();
	
		int x=ch.length;
		s1=" ";
		String s2=" ";
		int count=0;
		for(int i=0;i<x;i++)
		{
		   if(ch[i]!=' ')
			{
			   count++;
		   s1=s1+ch[i];}
		   else
			   s1=s1+count;
		
	
		}
		
		
		System.out.println(s2);
	}

}
