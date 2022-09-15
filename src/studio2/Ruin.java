package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println ("Input your start amount:");
		int startAmount = in.nextInt();

		System.out.println ("Input your win chance:");
		double winChance = in.nextDouble();

		System.out.println ("Input your win limit:");
		int winLimit = in.nextInt();
		
		System.out.println ("Input your total days:");
		int totalSimulations = in.nextInt();

		
		
	for (int i = 1; i <= totalSimulations; i++) {
		while(startAmount > 0 && startAmount < winLimit) {
			if (Math.random() <= winChance) {
				startAmount = startAmount + 1;
			}
			else {
				startAmount = startAmount - 1;
			}
			
		}
		
		if (startAmount > 0)	{
			System.out.println("Day " + i + ": Reached Win Limit");
		} else	{
			System.out.println("Day " + i + ": Busted");
		}
		
		}
	}

}
