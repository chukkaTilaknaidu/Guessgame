package in.ineuron.main;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
	    System.out.println("guess the number");
	    int b= a.nextInt();
	    int c=3;
	    Scanner d= new Scanner(System.in);
	    System.out.println("guess the firstplayer number");
	    int firstplayer=d.nextInt();
	    Scanner e= new Scanner(System.in);
	    System.out.println("guess the secondplayer number");
	    int secondplayer=e.nextInt();
	    Scanner f= new Scanner(System.in);
	    System.out.println("guess thirdplayer number");
	    int thirdplayer= f.nextInt();
	    
	    for(int i=0;i<c;i++) {
	    	
	    	if(b==firstplayer) {
	    		System.out.println("first player guess is correct");
	    		
	    		 
	    		
	    	}
	    	if(b==secondplayer) {
	    		System.out.println("second player guess is correct");
	    	}
	    	if (b==thirdplayer){
	    		System.out.println("third player guess is correct");
	    	}
	    	break;
	    }

	}

}
