package LinkedLists;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
    	Scanner input=new Scanner(System.in);
    	LinkedList list=new LinkedList();
    	String command="";
    	while(!command.equals("quit")){
    		System.out.println("Do u wish to insert, remove or quit>>");
    		command=input.next();
    		if(command.equals("insert")){
    			System.out.println("Enter a word to insert>>");
    			String word=input.next();
    			list.insertTail(word);
    			System.out.println(word + " had been insert to the linked list");
    			list.display();
    		}
    		if(command.equals("remove")){
    			System.out.println(list.remove() + " has been removed form the linked list");
    			list.display();
    		}
   
    	}
    	
    	
    }

}
