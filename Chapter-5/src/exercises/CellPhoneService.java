package exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		int minutes;
		int text;
		int data;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Talk minutes you use per month? >>> ");
		minutes = input.nextInt();
		System.out.println("Text messages you send per month? (0 if none) >>>");
		text = input.nextInt();
		System.out.println("Gigabytes of data you use per month? (0 if none) >>>");
		data = input.nextInt();
		
		if(minutes <= 500 && text == 0 && data == 0)
		{
			System.out.println("Plan A recommended, which is $49 a month for less than 500 minutes of talk and no text or data.");
		}
		if(minutes < 501 && text > 0)
		{
			System.out.println("Plan B recommended, which is $55 a month for less than 500 minutes of talk and any text messages.");
		}
		if(minutes >= 501 && text > 0 && data == 0)
		{
			System.out.println("Either Plan C recommended, which is $61 a month with 100 text messages, or Plan D for 100 messages or more for $70 a month.");
		}
		if(data > 0)
		{
			System.out.println("Either Plan E recommended, which is up to 2 gigabytes a month for $79, or Plan F for more than 2 gigabytes at $87.");
		}
		
		
	}

}