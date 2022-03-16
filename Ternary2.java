//Q2: using ternary check if number eneterd by user is positive or negative .
//In case number is positive store "Positive number" else store negative number to Result variable

package com.vivek;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextFloat();
		String result;
		result = number>0?"Positive Number":"Negative Number";
		System.out.println(result);

	}

}
