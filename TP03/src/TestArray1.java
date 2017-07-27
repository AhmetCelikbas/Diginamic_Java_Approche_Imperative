
/**
*
*@author keylan
* Classe TestArray1
*/
public class TestArray1 {

	/**
	 * 
	 * @param args
	 * Exercice 1 du TP03
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		/*
		 * Afficher l’ensemble des éléments du tableau grâce à une boucle :
		 * 
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		*/
		
		/*
		 * Afficher l’ensemble des éléments dans l’ordre inverse du tableau :
		 *
		for (int i = array.length-1; i > 0; i--) {
			System.out.println(array[i]);
		}
		*/
		
		/*
		 * Faire une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		 */
		for (int i = array.length-1; i > 0; i--) {
			if(array[i] > 3) {
				System.out.println(array[i]);
			}
		}
	}

}
