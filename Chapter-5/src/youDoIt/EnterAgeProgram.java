package youDoIt;

import java.util.Scanner;

public class EnterAgeProgram {

	public static void main(String[] args) 
	{	
			int age; 
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your age? >>>>>>");
			age = input.nextInt();
			if(age <= 18)
			{
					System.out.println("User is less than 18.");
			}
			if(age >= 23 & age <= 30)
			{
					System.out.println("User is older than 23 but less than 30");
			}
			if(age >= 31 & age <=50)
			{
				System.out.println("User is between 30 years old and 50 years old");
			}
			if(age >= 50 & age <=65)
			{ 
				System.out.println("User is between the ages 50 and 65");
			}
			if(age >= 66 & age <=100)
			{
				System.out.println("User is between the ages 66 and 100");
			}
	}

}
