package com.Amit.BasicProg.BalancedParantheses;
import java.util.Scanner;
import java.util.Stack;
public class BalancedParanthesisClass {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the String");
		String s1 = scn.nextLine();
		char[] ch = s1.toCharArray();
		int flag = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[0] != '(') {
				flag++;
				break;
			}
			if (ch[i] == '(') {
				s.push(ch[i]);
			} else if (ch[i] == ')') {
				s.pop();
			}}
		if (s.isEmpty() && flag == 0)
			System.out.println("this is the balanced paranthensis String");
		else
			System.out.println("this is not the balanced paranthesis String");
	}}
