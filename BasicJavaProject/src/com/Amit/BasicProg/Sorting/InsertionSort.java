package com.Amit.BasicProg.Sorting;

import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scn.nextLine();
		char[] ch=s.toCharArray();
		String s1=insertionSort(ch);
	System.out.println(s1);
		
	}

	private static String insertionSort(char[] ch) {
		for(int i=0;i<ch.length;i++)
			for(int j=i;j>0;j--)
				if(ch[j]<ch[j-1])
				{
					char temp=ch[j];
					ch[j]=ch[j-1];
					ch[j-1]=temp;
				}
		return new String(ch);
}

}
