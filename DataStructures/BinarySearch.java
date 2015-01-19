package binarySearch;
import java.util.Scanner;

public class BinarySearch {
	public static String answer;
	public static Scanner input;
	
	public static void main(String args[]) {
		input = new Scanner(System.in);
		System.out.print("Enter the range> ");
		int range = input.nextInt();
		System.out.print("Enter a random number between 1 and the range> ");
		int ranNum = input.nextInt();
		int result = 0;
		int lowerBound=1;
		int Limit=range;
		boolean equals=true;
		int guess = range/2;
		System.out.println("Are u ready bitcheeeaaas>> ");
		String reply=input.next();
		reply=reply.toUpperCase();
		if(reply.charAt(0)=='Y'){
			long start = System.currentTimeMillis(); 

		if(guess*2==ranNum){
				result++;
				equals=false;
				System.out.println("correct");
				System.out.println("It took " + result + " goes");
	 	}
		while(true){
			System.out.println(guess);
			System.out.print(">>");
			answer=input.next();
            answer=answer.toUpperCase();
            if(answer.charAt(0)=='H'){
            	lowerBound=guess;
            	lowerBound++;
            	
            }
            if(answer.charAt(0)=='L'){
            	Limit=guess;
            	Limit--;
            }
            result++;
            guess=(lowerBound+Limit)/2;
			if(ranNum==guess){
			result++;
			equals=false;
			System.out.println("correct");
			System.out.println("It took " + result + " goes");
			long elapsed = System.currentTimeMillis() - start;
			System.out.println("it took " + elapsed + " miliseconds to complete");
			}
			
			
		}
		}
		
		else if(reply.charAt(0)=='N'){
			System.out.println("You said no your lost");
		}
		else{
			System.out.println("Invalid result ye dumbshit");
		}

		

	}

}
