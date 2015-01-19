package lab7;

public class Stack {

	private int maxSize; 
    private char[] stackArray; 
    private int top; 
    
	public Stack(String word){
		maxSize=word.length();
		stackArray=new char[maxSize];
		top=-1;
		
	}

	
	public void push(char word){
		top++;
		stackArray[top]=word;
		System.out.println("push " + word);
		
	}
	
	public char pop() {  
		 char letter=stackArray[top--];
		 System.out.println("pop " + letter);
		 return letter;
		} 
	
}
