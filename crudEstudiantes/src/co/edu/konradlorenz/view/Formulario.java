package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Formulario {
	
	// - // - // Attributes // - // - //
	static Scanner leer = new Scanner(System.in);
	
	
	// - // - // Methods // - // - //
	public static String pedirNombres(String nombres){//Mandatory pedirString(String):String;
		System.out.println("Ingrese los nombres del estudiante: ");
		nombres = leer.nextLine();
		return nombres;
	}
	
	public static String pedirApellidos(/*/String apellidos/*/){
		System.out.println("Ingrese los apellidos del estudiante: ");
		return leer.nextLine();
	}
	
	public static long pedirCodigo(){//Mandatory pedirLong():long;
		System.out.println("Ingrese el código del estudiante: ");
		return leer.nextLong();
	}
	
	public static byte pedirEdad(){
		System.out.println("Ingrese la edad del estudiante: ");
		return leer.nextByte();
	}
	
	public static String pedirPrograma(/*/String programa/*/){
		System.out.println("Ingrese el programa del estudiante: ");
		return leer.nextLine();
	}
	
	public static String pedirCorreo(/*/String correo/*/){
		System.out.println("Ingrese el correo del estudiante: ");
		return leer.nextLine();
	}
	
	public static byte pedirNumeroMatriculo(){
		System.out.println("Ingrese el número de matrícula del estudiante: ");
		return leer.nextByte();
	}
	
	public static void mostrarEstudiante(String estudianteInfo){//Mandatory mostrarEstudiante(String):void;
		System.out.println(estudianteInfo);
	}
	
	public static int pedirEntero(String numero) {//Mandatory pedirEntero(String):int;
		System.out.println("Selecciona el número del estudiante: ");
		//TODO:Método para mostrar la lista de estudiantes.
		return leer.nextInt();
	}
}
