package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) {
		
		double smallTacoPrice = 0.99;
		double mediumTacoPrice = 1.99;
		double largeTacoPrice = 2.99;
		double chipsAndSalsaPrice = 4.50;
		double beefAndBeanBuritoPrice = 3.50;
		double makeYourOwnStuffedBurritoPrice = 6.50;
		double enchiladasPrice = 12.89;
		double chimichangasPrice = 8.00;
		double taquitosPrice = 6.50;
		double tortilasPrice = 4.50;
		double tax;
		double salesTax = 6;
		double actualTotal;
		
		int smallTacosOrdered;
		int mediumTacosOrdered;
		int largeTacosOrdered;
		int chipsAndSalsasOrdered;
		int beefAndBeanBurritosOrdered;
		int makeYourOwnBurritosOrdered;
		int enchiladasOrdered;
		int chimichangasOrdered;
		int taquitosOrdered;
		int tortillasOrdered; 
		
		double smallTacoTotal;
		double mediumTacoTotal;
		double largeTacoTotal;
		double chipsAndSalsaTotal;
		double beefAndBeanBuritoTotal;
		double makeYourOwnStuffedBuritoTotal;
		double enchiladasTotal;
		double chimichangasTotal;
		double taquitosTotal;
		double tortillasTotal; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many small tacos do you want? >>>");
		smallTacosOrdered = input.nextInt();
		smallTacoTotal = smallTacosOrdered * smallTacoPrice;
		System.out.print("How many medium tacos do you want? >>>");
		mediumTacosOrdered = input.nextInt();
		mediumTacoTotal = mediumTacosOrdered * mediumTacoPrice;
		System.out.print("How many large tacos do you want? >>>");
		largeTacosOrdered = input.nextInt(); 
		largeTacoTotal = largeTacosOrdered * largeTacoPrice;
		System.out.print("How many orders of chips and salsa do you want? >>>");
		chipsAndSalsasOrdered = input.nextInt();
		chipsAndSalsaTotal = chipsAndSalsasOrdered * chipsAndSalsaPrice;
		System.out.print("How many beef and bean burritos do you want? >>>");
		beefAndBeanBurritosOrdered = input.nextInt();
		beefAndBeanBuritoTotal = beefAndBeanBurritosOrdered * beefAndBeanBuritoPrice;
		System.out.print("How many make your own stuffed burritos do you want? >>>");
		makeYourOwnBurritosOrdered = input.nextInt();
		makeYourOwnStuffedBuritoTotal = makeYourOwnBurritosOrdered * beefAndBeanBuritoPrice;
		System.out.print("How many make enchiladas do you want? >>>");
		enchiladasOrdered = input.nextInt();
		enchiladasTotal = enchiladasOrdered * enchiladasPrice;
		System.out.print("How many make chimichangas do you want? >>>");
		chimichangasOrdered = input.nextInt();
		chimichangasTotal = chimichangasOrdered * chimichangasPrice;
		System.out.print("How many make tquitos do you want? >>>");
		taquitosOrdered = input.nextInt();
		taquitosTotal = taquitosOrdered * taquitosPrice;
		System.out.print("How many make tortillas do you want? >>>");
		tortillasOrdered = input.nextInt();
		tortillasTotal = tortillasOrdered * tortilasPrice;
		
		System.out.println("You ordered "  + smallTacosOrdered +  " small tacos, it will cost "  + smallTacoTotal);
		System.out.println("You ordered "  + mediumTacosOrdered + " medium tacos, it will cost " + mediumTacoTotal);
		System.out.println("You ordered "  + largeTacosOrdered + "large tacos, it will cost " + largeTacoTotal);
		System.out.println("You ordered " + chipsAndSalsasOrdered + "chips and salsas, it will cost " + chipsAndSalsaTotal);
		System.out.println("You ordered " + beefAndBeanBurritosOrdered + "beef and bean burritos it will cost " + beefAndBeanBuritoTotal);
		System.out.println("You ordered " + makeYourOwnBurritosOrdered + " make your own burritos it will cost " + makeYourOwnStuffedBuritoTotal);
		System.out.println("You ordered " + enchiladasOrdered + " enchiladas it will cost " + enchiladasTotal);
		System.out.println("You ordered " + chimichangasOrdered + " chimichangas it will cost " + chimichangasTotal);
		System.out.println("You ordered "  + taquitosOrdered +  "taquitos it will cost "  + taquitosTotal);
		System.out.println("You ordered "  + tortillasOrdered +  "tortillas it will cost "  + tortillasTotal);
		
		DecimalFormat df = new DecimalFormat("0.00");
		double total = smallTacoTotal + mediumTacoTotal + largeTacoTotal + chipsAndSalsaTotal + beefAndBeanBuritoTotal + makeYourOwnStuffedBuritoTotal + enchiladasTotal + chimichangasTotal + taquitosTotal + tortillasTotal;
		System.out.println("Your total is " + (df.format(total)));
		
		tax = computeTaxAmount(total, salesTax);
		
		displayInfo(tax);
		
		actualTotal = total + tax;
		DecimalFormat df1 = new DecimalFormat("0.00");
		System.out.println("Your total will be $" + (df1.format(actualTotal)));
		
		
	}
	
	public static void displayInfo(double tax)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Your tax is " + (df.format(tax)));
	}
	
	public static double computeTaxAmount(double total, double salesTax)
	{
		double tax;
		tax = total * salesTax / 100;
		return tax;

	}

}
