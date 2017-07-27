package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	static int 		nombre1,
					nombre2;
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		System.out.print("Veuillez saisir le premier nombre ... ");
		nombre1 = in.nextInt();
		
		System.out.print("Veuillez saisir le second nombre ... ");
		nombre2 = in.nextInt();
		
		System.out.println(String.valueOf(nombre1) + '+' + String.valueOf(nombre2) + '=' + (nombre1 + nombre2));
		System.out.println(String.valueOf(nombre1) + '-' + String.valueOf(nombre2) + '=' + (nombre1 - nombre2));
		System.out.println(String.valueOf(nombre1) + '*' + String.valueOf(nombre2) + '=' + (nombre1 * nombre2));
		System.out.println(String.valueOf(nombre1) + '/' + String.valueOf(nombre2) + '=' + (nombre1 / nombre2));
		
	}

}
