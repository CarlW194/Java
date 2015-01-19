package Lab1;

import java.util.Scanner;
import java.util.Random;

public class HeadTail {

	public static void main(String args[]) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many times Player1 flips: ");
		int x = input.nextInt();
		System.out.println("Enter how many times Player2 flips: ");
		int y = input.nextInt();

		int Player1=0,Player2=0;
		int counter1=0,counter2=0;
		
		
		for (int monty = 0; monty < 1000000; monty++) {
			for (int pl1 = 0; pl1 < x; pl1++) {
				Player1 = generator.nextInt(2);
			}

			for (int pl2 = 0; pl2 < y; pl2++) {
			
				Player2 = generator.nextInt(2);
			}
			
			if(Player1==1){
				counter1++;
			}
			
			if(Player2==1){
				counter2++;
			}

		}
		
		if(counter1>counter2){
			System.out.println("Player1 had the most heads");
		}
		if(counter2>counter1){
			System.out.println("Player2 had the most heads");
		}
	}

}
