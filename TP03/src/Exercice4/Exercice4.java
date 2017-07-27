package Exercice4;

import java.util.Scanner;

public class Exercice4 {

	private static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		int 		menuChoisi = 0,
				nouveauNombre;
		
		int[] array= new int[1];
		
		
		System.out.println("Menu : ");
		System.out.println("  Choix 1. Ajouter un nombre");
		System.out.println("  Choix 2. Afficher les nombres existants.");
		
		
		while(true) {
			System.out.print("Quel menu voulez-vous choisir ? ");
			menuChoisi = in.nextInt();
			
			if(menuChoisi == 1) {
				System.out.println("   Menu choisi : 1. Ajouter un nombre");
				System.out.print("Quel nombre voulez-vous ajouter ? ");
				nouveauNombre = in.nextInt();
				
				
				//System.arraycopy(src, srcPos, dest, destPos, length);
				
				
				
			} else if(menuChoisi == 2) {
				System.out.println("   Menu choisi : 2. Afficher les nombres existants.");
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				
			} else {
				System.out.println("Menu introuvable.");
			}
		}
	}

}
