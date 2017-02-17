package com.Amit.ProgramUtility;

import java.util.Random;

import java.util.Scanner;

public class Utility {

	/**
	 * This Method is used to count Head and tail.
	 * 
	 * @param fliptime
	 *            (Integer Type)
	 */
	///////////////////////////////////////////////////////////
	public void countofheadandtail(int fliptime) {
		int headcount = 0;
		int tailcount = 0;
		for (int i = 0; i < fliptime; i++) {
			if (Math.random() < 0.5) {
				tailcount++;
			} else {
				headcount++;
			}
		}
		System.out.println("The number oF tail count is" + " " + tailcount);
		System.out.println("The number oF head count is" + " " + headcount);

		percentofheadtails(tailcount, headcount, fliptime);// method calling to
															// find the percent
	}// close of the countofheadandtail

	// method to find the percentage ofpercentofheadtails
	/**
	 * at com.Amit.BasicProg.Factor.main(Factor.java:18)
	 * 
	 * this method is ued to count the percentage of head and tail
	 * 
	 * @param tailcount
	 *            (Integer Type)
	 * @param headcount
	 *            (Integer Type)
	 * @param fliptime
	 *            (Integer Type)
	 */
	public void percentofheadtails(int tailcount, int headcount, int fliptime) {
		int percentofhead = (headcount * 100) / fliptime;
		int percentoftail = 100 - percentofhead;
		System.out.println("the pecentage of head is " + " " + percentofhead + "%");
		System.out.println("the pecentage of tail is " + " " + percentoftail + "%");
	}

	/**
	 * this method is used to check the given year is leapyear or not
	 * 
	 * @param year
	 *            (Integer Type)
	 */
	//////////////////////////////////////////////////
	public void checkLeapYear(int year) {
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("this" + " " + year + " " + " is a leap year");
		} else {
			System.out.println("this" + " " + year + " " + " is not a leap year");
		}
	}

	/**
	 * this method is used to print the powers of two in the form of table
	 * 
	 * @param number
	 *            (Integer Type)
	 */
	/////////////////////////////////////////
	public void powersOfTwo(int number) {
		int power = 0;
		if (number >= 0 && number <= 31)
			for (int i = 1; i < number; i++) {
				if (power == 0) {
					System.out.println(++power);
				}
				System.out.println(power = 2 * power);
			}

		else {
			System.out.println("please enter the correct number otherwise it will be show overflow message");
		}
	}

	/////////////////////////////////////
	/**
	 * this method will give sum of the harmonic number
	 * 
	 * @param number
	 *            (Integer type)
	 */
	public void printHarmonic(int number) {
		float sumOfHarmonic = 0;
		float lastValue = number;
		for (int i = 1; i <= number; i++) {
			sumOfHarmonic = (sumOfHarmonic + 1) / i;
			if (lastValue == number) {
				lastValue = (0 + 1) / lastValue;
			}
		}
		System.out.println("the sum for the given harmonic number till" + " " + number + " " + "is" + sumOfHarmonic);
		System.out.println("the sum for the nth means last harmonic number is" + " " + number + " " + "is" + lastValue);
	}

	////////////////////////////////
	public void checkFactor(int number) {
		int count = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				if (isPrime(i)) {

					System.out.println(i);
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		boolean flag = true;
		if (n % n == 0)
			return true;

		else if (n % 1 == 0)
			return true;
		return false;
	}

	///////////////////////// program 7
	/**
	 * this program is for the gambler
	 * 
	 * @param goodname
	 *            (String type)
	 * @param amount
	 *            (Integer type)
	 * @param luckyNumber
	 *            (Integer type)
	 * @param noOfTimes
	 *            (Integer type)
	 * @param lastAmount
	 *            (Integer type)
	 */
	public static void checkGoal(String goodName, int amount, int luckyNumber, int noOfTimes, int lastAmount) {
		int winTimes = 0;
		int loseTimes = 0;
		Random ran = new Random();
		int round = 0;
		int cash = amount;
		int betNum = luckyNumber;
		while (amount > 0 && amount < lastAmount && noOfTimes > round) {
			int ranValue = ran.nextInt(11);
			if (betNum == ranValue) {
				cash += betNum;
				System.out.println("so" + " " + goodName + " " + "now your cash value is" + (cash));
				System.out.println(ranValue + " " + "this time you win");
				winTimes++;

			} else {
				cash -= betNum;
				System.out.println(ranValue + "  " + "this time you loss");
				System.out.println("so" + " " + goodName + " " + "now your cash value is" + (cash));
				loseTimes++;
			}
			round++;
			if (cash == 0) {
				System.out.println("you dont have enough money to continue the game");
				break;
			}
			betNum++;
		}
		System.out.println("so" + " " + goodName + " " + "you have won" + " " + winTimes + " " + "times");
		System.out.println("so" + " " + goodName + " " + "you have lose" + " " + loseTimes + " " + "times");
		System.out.println("so" + " " + goodName + " " + "you have total amount with you is" + " " + (amount - cash));

		checkPercentOfTimes(winTimes, loseTimes, noOfTimes, goodName);
	}

	private static void checkPercentOfTimes(int winTimes, int loseTimes, int noOfTimes, String goodName) {
		double percentWinTime = (winTimes * 100) / noOfTimes;
		double percentLoseTime = 100 - percentWinTime;
		System.out.println("enter the randomwithin the rangeis (0-50)");
		System.out.println("so" + " " + goodName + " " + "your won percentage is" + percentWinTime + "%");
		System.out.println("so" + " " + goodName + " " + "your loss percentage is" + percentLoseTime + "%");
	}

	///////////////////////////// end of this program 7
	/////////////////////////////////////////// start of the program 8
	/**
	 * this method is used to store the unique couipon number in array
	 * 
	 * @param number
	 *            (Integer type)
	 */
	public void couponGenerator(int number) {
		int count = 0;
		Random random = new Random();
		int uniqueCouponArray[] = new int[number];
		int length = uniqueCouponArray.length;
		for (int i = 0; i < length; i++) {
			int ran = random.nextInt(50);
			uniqueCouponArray[i] = ran;
			count++;
			for (int j = 0; j < i; j++) {
				if (uniqueCouponArray[i] == uniqueCouponArray[j]) {
					i--;
					break;
				}
			}
		}
		for (int j = 0; j < length; j++) {
			System.out.println("the value at the" + " " + j + " " + "index" + " " + uniqueCouponArray[j]);
		}
	}

	///////////////////////////////// start of program 9
	public void printTwoDimensionalArray() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the First Dimensional range");
		int firstDimensionalRange = scn.nextInt();
		System.out.println("Enter the second Dimensional range");
		int secondDimensionalRange = scn.nextInt();
		int twoArray[][] = new int[firstDimensionalRange][secondDimensionalRange];
		System.out.println("Enter the Value that you Want To insert");
		for (int i = 0; i < twoArray.length; i++) {
			for (int j = 0; j < twoArray[i].length; j++) {

				int value = scn.nextInt();
				twoArray[i][j] = value;
			}
		}
		for (int i = 0; i < twoArray.length; i++) {
			for (int j = 0; j < twoArray[i].length; j++) {

				System.out.println("the value at the twoArray[" + i + "][" + j + "]" + "is" + " " + twoArray[i][j]);
			}
		}
		for (int i = 0; i < twoArray.length; i++) {
			for (int j = 0; j < twoArray[i].length; j++) {

				System.out.print(twoArray[i][j] + "   ");
			}
			System.out.println(" ");
		}
	}

	/////////////////////////////// program 10
	public static void addIntegerToZero() {
		int sum = 0;
		int res = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size for which you want to create Array  ");
		int number = scn.nextInt();
		int arrayNumber[] = new int[number];
		System.out.println("enter the value");
		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = scn.nextInt();
		}
		for (int i = 0; i < arrayNumber.length - 2; i++) {
			for (int j = i + 1; j < arrayNumber.length - 1; j++) {
				for (int k = j + 1; k < arrayNumber.length; k++) {
					res = arrayNumber[i] + arrayNumber[j] + arrayNumber[k];
				}
			}
		}
		if (res == sum) {
			System.out.println("this array has triplet value who sum is equal to zero");
		} else {
			System.out.println("this array has not triplet value who sum is equal to zero");
		}
	}

	///////////////////////////////////// program 10
	/**
	 * this method is used to check whether the String is Anagram or not
	 */
	public void checkAnagram() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1 = scn.nextLine();
		System.out.println("enter the second string");
		String s2 = scn.nextLine();
		if (s1.length() == s2.length()) {
			String removedSpacess1 = removeSpace(s1);
			String removedSpacess2 = removeSpace(s2);
			String convertedCases1 = convertLowerCase(removedSpacess1);
			String convertedCases2 = convertLowerCase(removedSpacess2);
			String sorts1 = sort(convertedCases1);
			String sorts2 = sort(convertedCases2);
			boolean bValue = check(sorts1, sorts2);
			if (bValue)
				System.out.println("the given string is a anagram");
			else
				System.out.println("the given string is not anagram");
		}
	}

	private static String convertLowerCase(String removedSpaces) {
		char[] ch = removedSpaces.toCharArray();
		for (int i = 0; i < removedSpaces.length(); i++) {
			if (ch[i] >= 65 && ch[i] <= 90)
				ch[i] = (char) (ch[i] + 32);
		}
		return new String(ch);
	}

	private static String removeSpace(String s1)

	{
		for (int i = 0; i < s1.length(); i++) {
			char ch[] = s1.toCharArray();
			s1 = " ";
			if (ch[i] != ' ') {
				s1 = s1 + ch[i];
			}
		}
		return s1;
	}

	private static String sort(String sortArray)

	{
		char[] ch = sortArray.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length - 1 - i; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j + 1];
					ch[j + 1] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);

	}

	private static boolean check(String s1, String s2) {
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] == ch2[i]) {
				return true;
			}
		}
		return false;
	}

	///////////////////////////// program 14
	/**
	 * this method is used to find out the elapsed time in between the start time and end time
	 */
	public void getElapsedTime() {
		long starttime = 0;
		long stoptime = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the 0 for the Start time");
		int n = scn.nextInt();
		if (n == 0) {
			starttime = System.currentTimeMillis();
			System.out.println("the time of start watch is" + " " + starttime);
		} else {
			System.out.println("please enter the valid number for the Start time");
			System.out.println("please Enter the O for the Start time");
			int n1 = scn.nextInt();

			if (n1 == 0)
				starttime = System.currentTimeMillis();
			System.out.println("the time of start watch is" + " " + starttime);
		}

		System.out.println("Enter the 1 for the Stop time");
		int s = scn.nextInt();
		if (s == 1) {
			stoptime = System.currentTimeMillis();
			System.out.println("the time of stop watch is" + " " + stoptime);
		} else {
			System.out.println("please enter the valid number for the Stop time");
			System.out.println("please Enter the 1 for the Start time");
			int s1 = scn.nextInt();
			if (s1 == 1) {
				stoptime = System.currentTimeMillis();
				System.out.println("the time of start watch is" + " " + stoptime);
			}
		}
		System.out.println("the elapsed time is" + " " + (stoptime-starttime) / 1000 + " " + "milli second");
		}
	///////////////////////////program15 half done
	public void findnumber()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number for which you want the power");
		int n=scn.nextInt();
		int baseValue=2;
		int value= power(baseValue,n);
		System.out.println("assume a number that has to be there within the range and if it is present the it will type yes");
		int n1=scn.nextInt();
		 search(value,n1);
	}
	private static int  power(int baseValue, int n) 
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			max=max*(baseValue*i);
		}
		System.out.println(max);
		return (max-1);
	}
	public void search(int value,int n1) {
		int start=0;
		int last=value;
		int mid=(start+last)/2;
		for(int i=0;i<last;i++)
		{
				if(n1<mid)
				{
					last=mid;
				}
		}
		
	}
	
}// close of the class
