package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Formulario {
	
	// - // - // Attributes // - // - //
	static Scanner leer = new Scanner(System.in);
	
	
	// - // - // Methods // - // - //
	public static byte mostrarMenu() {
		System.out.println(""
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««"
				+ "»»»    FUNDACIÓN UNIVERSITARIA KONRAD LORENZ    «««"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««"
				+ "»»»                                             «««"
				+ "»»»           Seleccione una opción:            «««"
				+ "»»»                                             «««"
				+ "»»»  [1] Mostrar todos los estudiantes          «««"
				+ "»»»  [2] Nuevo estudiante                       «««"
				+ "»»»  [3] Modificar estudiante                   «««"
				+ "»»»  [4] Eliminar estudiante                    «««"
				+ "»»»  [5] Salir                                  «««"
				+ "»»»                                             «««"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««");
		return leer.nextByte();
	}
	
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
	
	public static byte pedirNumeroMatricula(){
		System.out.println("Ingrese el número de matrícula del estudiante: ");
		return leer.nextByte();
	}
	
	public static void mostrarEstudiante(String estudianteInfo){//Mandatory mostrarEstudiante(String):void;
		System.out.println(estudianteInfo);
	}
	
	public static int pedirEntero(String wtf) {//Mandatory pedirEntero(String):int;
		
		//WTF No entiendo 🤡
		//TODO: Entender que chotas se hace aquí.
		return leer.nextInt();
	}
	
	public static String pedirPalabraDeBusqueda(){
		System.out.println(""
				+ "»»»                                             «««"
				+ "»»»      Ingrese un atributo de busqueda:       «««"
				+ "»»»                                             «««");
		return leer.nextLine();
	}
	
	public static String reintentarPalabraDeBusqueda(){
		System.out.println(""
				+ "»»»                                             «««"
				+ "»»» Ingrese un atributo de busqueda diferente:  «««"
				+ "»»»                                             «««");
		return leer.nextLine();
	}
	
	public static String pedirNuevoAtributo() {
		System.out.println(""
				+ "»»»                                             «««"
				+ "»»»         Ingrese el nuevo atributo:          «««"
				+ "»»»                                             «««");
		return leer.nextLine();
	}
	
	public static byte menuModificar() {
		System.out.println(""
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««"
				+ "»»»    FUNDACIÓN UNIVERSITARIA KONRAD LORENZ    «««"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««"
				+ "»»»                                             «««"
				+ "»»»     Seleccione una opción a modificar:      «««"
				+ "»»»                                             «««"
				+ "»»»  [1] Nombres                                «««"
				+ "»»»  [2] Apellidos                              «««"
				+ "»»»  [3] Código                                 «««"
				+ "»»»  [4] Edad                                   «««"
				+ "»»»  [5] Programa                               «««"
				+ "»»»  [6] Correo                                 «««"
				+ "»»»  [7] Número de matrícula                    «««"
				+ "»»»  [8] Cancelar modificación                  «««"
				+ "»»»                                             «««"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««");
		return leer.nextByte();
	}
	
	public static void cambioAtributoExitoso(){
		System.out.println(""
				+ "»»»                                             «««"
				+ "»»»      ¡Atributo actualizado con éxito!       «««"
				+ "»»»                                             «««");
	}
	
	public static void eliminarEstudianteExitoso(){
		System.out.println(""
				+ "»»»                                             «««"
				+ "»»»      ¡Estudiante eliminado con éxito!       «««"
				+ "»»»                                             «««");
	}
	
	public static void salir(){
		System.out.println(""
				+ "»»»                                             «««"
				+ "»»»           Saliendo del sistema...           «««"
				+ "»»»                                             «««");
	}
}
