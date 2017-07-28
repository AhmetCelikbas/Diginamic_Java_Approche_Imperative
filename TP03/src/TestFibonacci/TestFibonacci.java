package TestFibonacci;

import java.util.Scanner;

public class TestFibonacci {
	private static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		System.out.println("Suite de Fibonacci.");
		int rangChoisi = 0;
		while (true) {
			int 		fibonacci = 1,
					nMoins1 = 2,
					nMoins2 = 1;
		    
			System.out.print("Choisir un rang : ");
			rangChoisi = in.nextInt();	

		    for ( int n = 1 ; n <= rangChoisi ; n++ ) {
		        if ( n == 2 ) {
		        		fibonacci = 2;
		        	}
		        
		        if ( n > 2 ) {
		        		fibonacci = nMoins1 + nMoins2;
		        		nMoins2 = nMoins1;
		        		nMoins1 = fibonacci;
		        	}
		    
		        System.out.print(fibonacci + "; "); 
		    }
		    System.out.println(); 
		}
	}
}