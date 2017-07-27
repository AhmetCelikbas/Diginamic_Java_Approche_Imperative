package TestArray2;
	/**
	 * 
	 * @param args
	 * Exercice 2 du TP03
	 */
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		/*
		 * Quelle est la moyenne des éléments du tableau ?
		 *
		int somme = 0;
		for(int i = 0; i < array.length; i++){
			somme += array[i];
		}
		float moyenne = (float) somme / array.length;
		System.out.print("\nMoyenne = "+moyenne);
		*/
		
		/*
		 * Quel est l’index dans le tableau de l’entier 15 ?
		 * L'entier 15 est en position 1
		 */
		
		
		/*
		 * Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau
		 */
		int compteur = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					compteur++;
				}
			}
		}
		System.out.println("compteur = " + compteur);

		
		
	}

}
