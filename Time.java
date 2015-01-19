package Lab1;

import java.util.Scanner;

public class Time {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = input.nextInt();

		int count=0,percentage=0;
		
		
		for (int x = 0; x < 24; x++) {
			for (int y = 0; y < 6; y++) {
				for (int z = 0; z < 10; z++) {
					if (x + y + z > num) {
						count = count + (x + y + z);
					}
				}
			}
		}

		System.out.println(count);
		percentage = (count / (24 * 5 * 9));
		System.out.println("the percentage = " + percentage);

	}

}

