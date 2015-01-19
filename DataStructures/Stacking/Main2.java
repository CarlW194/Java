package lab7;

import java.util.Scanner;

public class Main2 {
	private static String reverse;
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a word u would like to reverse >>");
		String word=input.next();
        reverse="";		
		Stack myStack=new Stack(word);
		for(int i=0;i<word.length();i++){
	        myStack.push(word.charAt(i));
		}
		for(int j=0;j<word.length();j++){
	        reverse += myStack.pop();
	       
		}
		
		if(reverse.equals(word)){
			System.out.println(word + " is a Palindrome");
		}
		else{
			System.out.println(word + " is not a palindrome");
		}
		
	}
}
