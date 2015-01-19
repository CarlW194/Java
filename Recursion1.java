package recursion;

import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the nth term u want to find>> ");
		int term = input.nextInt();
		triangle(term);
	}

	public static int triangle(int n) {
		int total = 0;
		while (n > 0) {
			total = total + n;
			n--;
		}
		System.out.println(total);
		return total;
	}

}
