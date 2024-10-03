package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {
	private Scanner leer = new Scanner(System.in);

	public static byte mostrarMenu() {
		Ventana obj = new Ventana();

		System.out.print("\n"
				+ "<> <> <> Centro de Videojuegos <> <> <> \n"
				+ "		[0] Salir. \n"
				+ " 	[1] Asignar jugador a estación. \n"
				+ "		[2] Agregar tiempo a jugador. \n"
				+ "		[3] Cambiar jugador de estación. \n"
				+ "		[4] Registrar salida de jugador. \n"
				+ "		[5] Mostrar ingresos totales. \n"
				+ "		>> Ingrese una opción:");

		byte opcion = obj.leer.nextByte();
		obj.leer.nextLine();
		return opcion;

	}

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public static String pedirString(String info) {
		Ventana obj = new Ventana();
		System.out.println("\nIngrese " + info +":");
		return obj.leer.nextLine();
	}

}
