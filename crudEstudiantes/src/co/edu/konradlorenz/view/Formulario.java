package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Formulario {
	
	// - // - // Objects // - // - //
	static Scanner leer = new Scanner(System.in);
	
	
	// - // - // Methods // - // - //
	
	public static byte mostrarMenu(/*/TODO:String WTF/*/) {//Mandatory pedirEntero(String):int;
		System.out.println("\n"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««\n"
				+ "»»»    FUNDACIÓN UNIVERSITARIA KONRAD LORENZ    «««\n"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««\n"
				+ "»»»                                             «««\n"
				+ "»»»           Seleccione una opción:            «««\n"
				+ "»»»                                             «««\n"
				+ "»»»  [1] Mostrar todos los estudiantes          «««\n"
				+ "»»»  [2] Nuevo estudiante                       «««\n"
				+ "»»»  [3] Modificar estudiante                   «««\n"
				+ "»»»  [4] Eliminar estudiante                    «««\n"
				+ "»»»  [5] Salir                                  «««\n"
				+ "»»»                                             «««\n"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««\n");
		byte option = leer.nextByte();
		leer.nextLine();//Limpia Buffer
		return option;
	}
	
	public static void mostrarEstudiante(String estudianteToString){//Mandatory mostrarEstudiante(String):void;
		System.out.println(estudianteToString);
	}
	
	public static String pedirNombres(/*/String nombres/*/){//Mandatory pedirString(String):String;
		System.out.println("Ingrese los nombres del estudiante: ");
		return leer.nextLine();
	}
	
	public static String pedirApellidos(){
		System.out.println("Ingrese los apellidos del estudiante: ");
		return leer.nextLine();
	}
	
	public static long pedirCodigo(){//Mandatory pedirLong():long;
		System.out.println("Ingrese el código del estudiante: ");
		long codigo = leer.nextLong();
		leer.nextLine();//Limpia Buffer
		return codigo;
	}
	
	public static byte pedirEdad(){
		System.out.println("Ingrese la edad del estudiante: ");
		byte edad = leer.nextByte();
		leer.nextLine();//Limpia Buffer
		return edad;
	}
	
	public static String pedirPrograma(){
		System.out.println("Ingrese el programa del estudiante: ");
		return leer.nextLine();
	}
	
	public static String pedirCorreo(){
		System.out.println("Ingrese el correo del estudiante: ");
		return leer.nextLine();
	}
	
	public static byte pedirNumeroMatricula(){
		System.out.println("Ingrese el número de matrícula del estudiante: ");
		byte matricula = leer.nextByte();
		leer.nextLine();//Limpia Buffer
		return matricula;
	}
	
	public static void estudianteCreadoExitoso(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»     ¡Nuevo estudiante creado con éxito!     «««\n"
				+ "»»»                                             «««\n");
	}
	
	public static long pedirCodigoDeBusqueda(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»      Ingrese el código del estudiante:      «««\n"
				+ "»»»                                             «««\n");
		long codigo = leer.nextLong();
		return codigo;
	}
	
	public static long reintentarCodigoDeBusqueda(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»             Ingrese nuevamente              «««\n"
				+ "»»»          el código del estudiante:          «««\n"
				+ "»»»                                             «««\n");
		long codigo = leer.nextLong();
		return codigo;
	}
	
	public static void estudianteEncontrado(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»           ¡Estudiante encontrado!           «««\n"
				+ "»»»                                             «««\n");
	}
	
	public static String pedirNuevoAtributo() {
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»         Ingrese el nuevo atributo:          «««\n"
				+ "»»»                                             «««\n");
		return leer.nextLine();
	}
	
	public static byte menuModificar() {
		System.out.println("\n"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««\n"
				+ "»»»    FUNDACIÓN UNIVERSITARIA KONRAD LORENZ    «««\n"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««\n"
				+ "»»»                                             «««\n"
				+ "»»»     Seleccione una opción a modificar:      «««\n"
				+ "»»»                                             «««\n"
				+ "»»»  [1] Nombres                                «««\n"
				+ "»»»  [2] Apellidos                              «««\n"
				+ "»»»  [3] Código                                 «««\n"
				+ "»»»  [4] Edad                                   «««\n"
				+ "»»»  [5] Programa                               «««\n"
				+ "»»»  [6] Correo                                 «««\n"
				+ "»»»  [7] Número de matrícula                    «««\n"
				+ "»»»  [8] Cancelar modificación                  «««\n"
				+ "»»»                                             «««\n"
				+ "»»» ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ «««\n");
		byte option = leer.nextByte();
		leer.nextLine();//Limpia Buffer
		return option;
	}
	
	public static void cambioAtributoExitoso(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»      ¡Atributo actualizado con éxito!       «««\n"
				+ "»»»                                             «««\n");
	}
	
	public static void eliminarEstudianteExitoso(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»      ¡Estudiante eliminado con éxito!       «««\n"
				+ "»»»                                             «««\n");
	}
	
	public static void salir(){
		System.out.println("\n"
				+ "»»»                                             «««\n"
				+ "»»»              Fin del programa               «««\n"
				+ "»»»                                             «««\n");
	}
}
