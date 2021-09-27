package com.company.main;

import java.util.Scanner;

import com.company.main.*;

public class Driver {
	
	public static void main (String[] args)  {
		int numberOfCompany,TestCase ;
		double stockOfCompany;
		boolean stockRiseToday;

		try (Scanner sc = new Scanner( System.in )) {
			
			System.out.println("Enter the TestCase Number");
			TestCase = sc.nextInt();
			System.out.println("Executing Testcase : "+TestCase + " for Company Array Size "+TestCase );
			
			Company comp = new Company(TestCase);
			 	 
			System.out.println("*----------------------------------------------*");
			for (int i=0; i<TestCase ; i++) {
				System.out.println("Enter the  no of Companies ");

				numberOfCompany = sc.nextInt();

				System.out.println("Enter the  current stock of Companies " + numberOfCompany);

				stockOfCompany = sc.nextDouble();

				System.out.println("Whether company's stock price rose today compare to yesterday? " );

				stockRiseToday = sc.nextBoolean();	

				Company.insertArray(numberOfCompany, stockOfCompany, stockRiseToday, i);
			}
			Company.display(TestCase);
		}

	}

}
