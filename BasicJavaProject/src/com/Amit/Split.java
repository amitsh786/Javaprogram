package com.Amit;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Plzs enter the String");
		String s = scn.nextLine();
		char[] ch = s.toCharArray();
		String[] ch1 = new String[ch.length];
		String st= "";
		for (int i = 0; i < ch.length ; i++) {
			while(ch[i] != ' ') {
				st = st+ ch[i];
				
			}
			for(int j=0;j<ch1.length;j++)
			{
			ch1[j] = st;
			
			}
		}
			
		
		for (String s1 : ch1) {
			System.out.println(s1);
		}
	}

}
