package exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) 
	{
		
		int choice;
		int choice2;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 1 for Park View, 2 for Golf Course, or 3 for Lake View");
		
		
		choice = input.nextInt();
		if (choice == 1) 
		{
			System.out.println("Park View Condo for $150,000.");
			System.out.println("Enter 1 for a $5,000 garage or 2 for a free parking space?");
			choice2 = input.nextInt();
		if (choice2 == 1) 
		{
			System.out.println("Park View Condo with Garage for $155,000");
		}	
			else 
				System.out.println("Park View Condo with Parking Space for $150,000");
		}
		
		choice = input.nextInt();
		if (choice == 2)
		{	
			System.out.println("Golf Course View Condo for $170,000");
			System.out.println("Enter 1 for $5,000 garage or 2 for a free parking space");
			choice2 = input.nextInt();
			if (choice2 == 1)
			{
			System.out.println("Golf Course View Condo with Garage for $175,000");
			}
				else
					System.out.println("Golf Course View Condo with Parking Space for $170,000");
		}
		
		if (choice == 3)
			System.out.println("Lake View Condo for $210,000");
			System.out.println("Enter 1 for $5,000 garage or 2 for a free parking space");
			choice2 = input.nextInt();
		if (choice2 == 1)
		{
			System.out.println("Lake View COndo with Garage for $215,000");
		}
		else
			System.out.println("Lake View Condo with parking space for $210,000");
		
		if (choice == 0)
			System.out.println("No Condo for $0");
	
		
			
		
		
		
	}
	}


