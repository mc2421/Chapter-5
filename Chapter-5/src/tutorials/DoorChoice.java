package tutorials;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Door Choice
//Author: Michael Curtis
public class DoorChoice {

	public static void main(String[] args) 
	{
		//Door prize program
		Scanner input = new Scanner(System.in);
		String choiceString;
		int doorChoice;
		int response = 1;
		while(response == 1)
		
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, or 3.",
				"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement structure for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null,  "You win Nothing!| HAHAHAHAHA!");
			//How many tacos
			//math * ordered = whatever
			//The cost this blank blank
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null,  "You win less than Nothing! HAHAHAHA");
		}
		if(doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike! HAHHAHAHA");
		}
		else
			JOptionPane.showMessageDialog(null, "That number was not an option, I said 1-3. ");
		System.out.println("Would you like to try again? 1 for yes 2 for no>>>>");
		response = input.nextInt();
	}
	System.out.println("You have exited the game");
	
}


		
		



