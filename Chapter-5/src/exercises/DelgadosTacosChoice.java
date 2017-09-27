package exercises;

import java.util.Scanner;

public class DelgadosTacosChoice {

	public static void main(String[] args) 
	{
		int choice1;
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Please choose 1 for a taco or 2 for a burrito.");
		choice1 = input.nextInt();
			if (choice1 == 1)
			{
				System.out.println("You chose a burrito.");	
			}
			if (choice1 == 2)
			{
				System.out.println("You chose a taco.");	
			}
			if (choice1 >= 3 & choice1 <= 999)
			{
				System.out.println("I said 1 or 2, not " + choice1);
			}
			if (choice1 >= 1000 & choice1 <= 9999)
			{
				System.out.println("Those numbers are not choices, please choose 1 or 2.");
			}
			if (choice1 >= 9999)
			{
				System.out.println("If you go any higher than 2147000000, the program will crash. It cannot handle integers that big.");
			}
	}
}