package com.vivek;

import java.util.Scanner;

public class Product1 {
	String pname;
	float price;
	float discount;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name: ");
		pname = sc.next();
		System.out.println("Enter the price of the product: ");
		price = sc.nextFloat();
		sc.close();
	}
	
	void calculate()
	{
		discount = (price>2000)?9:7;
	}
	
	void display() 
	{
		System.out.println("Product Name is : "+pname);
		System.out.println("Product Price is : "+price);
		System.out.println("Discount on the product is : "+discount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 p = new Product1();
		p.input();
		p.calculate();
		p.display();

	}

}
