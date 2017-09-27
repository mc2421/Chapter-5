package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;

public class RockPaperScissors2 {

	public static void main(String[] args) {
		
		for(int x=0; x<5;++x)
		{
			displayRPS();
		}

	}
	public static void displayRPS()
	{
		String userEntryString;
		String result = null;
		int userEntry;
		Random rand = new Random();
		int r = rand.nextInt(3) + 1;
		userEntryString = JOptionPane.showInputDialog(null, "Welcome to rock, paper, scissors. \n1 = Rock\n2 = Paper\n3 = Scissors");
		userEntry = Integer.parseInt(userEntryString);
		
		if(userEntry == 1)//rock
		{ 
			if(r == 3)//Scissors
				result = "You Won!";
			if(r == 2) //Paper
				result = "You Lose!";
			if(r == 1) //Rock
				result = "Tie";
		}
		if(userEntry == 2)//paper
		{
			if(r == 3) //Scissors
			result = "You Lose!";
			if(r == 2) //Paper
			result = "Tie!";
			if(r == 1) //Rock 
			result = "You Win";
		}
		if(userEntry == 3)//scissors
		{
			if(r == 3) //Scissors
			result = "Tie!";
			if(r == 2) //Paper
			result = "You Win!";
			if(r == 1) //Rock
			result = "You Lose";
				
		}
		JOptionPane.showMessageDialog(null, + result);
		}
}
