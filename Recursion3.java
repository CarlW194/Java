package recursion;

public class Recursion3 {
	
	public static void main(String args[]){
		People(239);
					
	}
	
	public static int People(int num){
		int count=365;
		while(count!=num){
			count--;
			if(count==num){
				System.out.println("It is likely " + count);
			}
		}
	}
	

}
