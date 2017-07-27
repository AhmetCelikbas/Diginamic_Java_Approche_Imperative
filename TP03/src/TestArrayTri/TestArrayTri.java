package TestArrayTri;

import java.util.Arrays;

/**
 * 
 * @author keylan
 * Exercice 3 du TP03
 */
public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		/*
		 * Faire un algorithme qui trie le tableau dans l’ordre ascendant
		 *
		int buffer;	
		for(int i=0; i < array.length; i++){  
			for(int j=1; j < (array.length-i); j++){  
				if(array[j-1] > array[j]){
					buffer = array[j-1];  
					array[j-1] = array[j];  
					array[j] = buffer;  
				}  
			}  
		}
		
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		*/
		
		
		/*
		 * Utiliser la classe Arrays pour trier le tableau
		 */
		Arrays.sort(array);
		
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
	}

}
