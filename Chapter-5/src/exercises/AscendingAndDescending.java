package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number. >>>");
		num1 = input.nextInt();
		System.out.println("Please enter another number. >>>");
		num2 = input.nextInt();
		System.out.println("Please enter one more number. >>>");
		num3 = input.nextInt();
		
		if( (num1 <= num2))
		{ 
			System.out.println( num1 + " is less than " + num2);  
			
		}
	

	}

}
