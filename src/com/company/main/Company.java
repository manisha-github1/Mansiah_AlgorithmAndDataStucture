package com.company.main;

import java.util.Arrays;
import java.util.Scanner;

import com.companyutility.module.SearchSort;

public class Company {

	public static Scanner sc = new Scanner( System.in );

	static int arrNumberOfCompany[] ;
	static double arrStockOfCompany[];
	static boolean arrStockRiseToday[];
	static int size = 0;
	static int capacity ;
	
	Company(int a ) {
			Company.capacity = a;
			Company.arrNumberOfCompany = new int[a]; 
			Company.arrStockOfCompany = new double[a]; 
			Company.arrStockRiseToday = new boolean[a];
		}
	

	public static void insertArray(int numberOfCompany, double stockOfCompany, boolean stockRiseToday, int i) {
		
			arrNumberOfCompany[i] = numberOfCompany;
			arrStockOfCompany[i] = stockOfCompany;
			arrStockRiseToday[i] = stockRiseToday;
		}


	public static void display(int size) {

		int loopLength = 1;

		for (int i=0; i <= loopLength ; i++) {

			System.out.println("Enter the operation that you want to perform " );
			System.out.println("--------------------------------------------------- " );
			System.out.println("1. Display the companies stock prices in ascending order " );
			System.out.println("2. Display the companies stock prices in descending order " );
			System.out.println("3. Display the total no of companies for which stock prices rose today " );
			System.out.println("4. Display the total no of companies for which stock prices declined today " );
			System.out.println("5. Search a specific stock price " );
			System.out.println("6. press 6 to exit " );	
			System.out.println("");

			int userInput = sc.nextInt();
			SearchSort ob = new SearchSort();

			switch( userInput ) {
			case 0:
				System.out.println("Program exited successfully. " );
				System.exit(0);
				break;
			case 1:
				userInput = 1;
				ob.sort(arrStockOfCompany, 0, arrStockOfCompany.length - 1);
				System.out.println( "Stock prices in ascending order are :"+ Arrays.toString(arrStockOfCompany));
				System.out.println("");
				break;
			case 2:
				userInput = 2;
				ob.reverseSort(arrStockOfCompany, 0,arrStockOfCompany.length - 1);
				System.out.println( "Stock prices in descending order are :"+ Arrays.toString(arrStockOfCompany));
				System.out.println("");
				break;
			case 3:
				ob.totalCountRose(arrStockRiseToday, size);
				System.out.println("");
				break;
			case 4:	
				ob.totalCountDeclined(arrStockRiseToday, size);
				System.out.println("");
				break;
			case 5:
				System.out.println("Enter the key value . " );
				double userStockPrice = sc.nextDouble();
				ob.searchStockPrice(arrStockOfCompany, userStockPrice, size);
				System.out.println("");
				break;
			case 6:
				System.out.println("Program exited successfully. " );
				System.exit(0);
				break;
			default:
				//System.out.println( "Incorrect choice" );
				System.out.println("");
				System.out.println("Program exited successfully. " );
				System.exit(0); 
				return;
			}

			if 
			(userInput == 0) {
				System.out.println("Program exited successfully. " );
				System.exit(0); 
			}

			loopLength = loopLength +1;
		}		
	}
	
}

