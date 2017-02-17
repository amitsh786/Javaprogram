package com.bridgeit.amit.programs;

import java.util.LinkedList;
import java.util.Queue;

import com.bridgeit.amit.util.utility;

public class CashCounter {

	public static void main(String[] args)
	{
		utility ut=new utility();
		System.out.println("WelCome to tanatan bank....lavdese");
		System.out.println("Intial cash in cash counter");
		double cash = ut.inputDouble();
		
		Queue<Customer> que=new LinkedList<Customer>();
		
		System.out.println("Enter your name..");
		String name = ut.inputString();
		System.out.println("Customer name: "+name);
		System.out.println("please enter amount to be trancation...");
		double amount = ut.inputDouble();
		
		System.out.println("please Come in Queue");
		que.add(new Customer(name, 20, amount));
		System.out.println("Customer added in queue");
		System.out.println("\nPlease enter the choice\n 1 for Deposite and 2 for withdraw");
		int choice = ut.inputInt();
		
		switch (choice) 
		{
		case 1:
			cash+=amount;
			System.out.println("Amount Deposited....");
			que.remove();
			System.out.println("Customer removed from queue");
			break;
		case 2:
			cash-=amount;
			System.out.println("Amount withdraw");
			que.remove();
			System.out.println("Customer removed from queue");
			break;
		default:
			System.out.println("Invalid option please enter the valid user");
			break;
		}
		
		System.out.println("Balance :"+ cash);
		
	}

}
