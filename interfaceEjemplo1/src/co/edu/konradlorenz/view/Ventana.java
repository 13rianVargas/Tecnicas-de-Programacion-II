package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static double pedirDouble() {
		double dato = sc.nextDouble();
		sc.nextLine();
		return dato;
	}
	
}
