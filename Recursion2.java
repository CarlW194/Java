package recursion;

import java.util.Scanner;

public class Recursion2 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number>>");
		int num1 = input.nextInt();
		System.out.print("Enter a second number>>");
		int num2 = input.nextInt();
		System.out.println("(" + num1 + "," + num2 + ")");
		commonDiviser(num1, num2);
	}

	public static int commonDiviser(int num1, int num2) {
		int diviser = 0;
		while (num1 >= 0 && num2 >= 0) {
			if (num2 == 0)
				System.out.println("The biggest common denominator is " + num1);
			if (num2 > 0)
				return commonDiviser(num2, num1 % num2);
		}
		return diviser;
	}

}
