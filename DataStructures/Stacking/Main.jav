package lab7;
import java.util.Scanner;

public class Main {
	private static String reverse;
	private static char letter;
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a word u would like to reverse >>");
		String word=input.next();
		reverse="";
		Stack myStack=new Stack(word);
		
		for(int i=0;i<word.length();i++){
			for(int j=word.length()-1;j>=i;j--){
				System.out.println(j + "|_" + "_|");
				if(j==i)
			    myStack.push(word.charAt(i));
					
				
			}
	        
		}
		
		for(int j=0;j<word.length();j++){
	        reverse += myStack.pop();
	       
		}
		System.out.println("Reversed:"+reverse);
	}
}
