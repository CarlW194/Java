package LinkedLists;
import java.util.Scanner;

public class LinkedList {
	 
	 public String word;
	 private Link first; // ref to first link 
	 private Link last;
	 private int size;
	 
	 
	 public LinkedList(){ 
	      first = null;
	 } 
	 
	 public boolean isEmpty(){ 
    	  return (first==null); 
	 } 


	 public void insertTail(String word) { // insert at tail
		 size++;
		 Link newLink = new Link(word); // make new link 
		 newLink.next = null; 
		 if( isEmpty() ){  
		 first = newLink;  
		 }else{ 
		 last.next = newLink; 
		 }  
		 newLink.next=last;
		 last=newLink;
		 } 
	 
	 
	 public Link remove() { 
		 size--;
		 if(isEmpty()){
		 }
		 Link temp = first; // save reference to link 
		 first = first.next; // delete it: first-->oldnext 
		 return temp; // return deleted link 
		 }
	 
	 
	 public void printout(){
		 while(size>=0){
		 System.out.print(word + " ");
		 size--;
		 }
	 }
	 
	 public void display() { 
		 Link current = first; // start with first link 
		 while(current!=null){  //print out the link 
		 current.displayLink();
         current=current.next;
		 //keep going until you come to the end 
		 } 
		} 

	 
}
