package miPrimeraAgenda;

import java.util.*;

public class AplMain {

	// - // - // - // Globales // - // - // - //
	static Scanner sc = new Scanner(System.in);
	static List<Contacto> listaDeContactos = new ArrayList<>();
	static boolean valid = false;
	static Contacto contactFound;
	static String word;
	static int option;
	static String message;
	static int opt;

	public static void main(String[] args) {

		// - // - // - // Creación de Objetos // - // - // - //
		Contacto contact1 = new Contacto("Brian Vargas", 321225697, "brians.vargasc@konradlorenz.edu.co",
				"Konrad Lorenz");

		System.out.println(contact1.agregar(contact1));

		// - // - // - // Llamada de Métodos // - // - // - //
		while (valid == false) {
			System.out.print("Escribe una palabra de busqueda: ");
			word = sc.nextLine();
			contactFound = contact1.buscar(word);
		}

		System.out.println("Elige una opción:");
		System.out.println("(1) Enviar mensaje");
		System.out.println("(2) Modificar");
		System.out.println("(3) Llamar");
		System.out.println("(4) Eliminar");

		option = sc.nextInt();

		switch (option) {
			case 1:
				System.out.print("Escribe el mensaje a enviar: ");
				sc.next(); // buffer
				message = sc.nextLine();
				System.out.println(contactFound.enviarMensaje(message));
				break;
			case 2:
				System.out.println("¿Qué deseas modificar?");
				System.out.println("Elige una opción:");
				System.out.println("(1) Nombre");
				System.out.println("(2) Celular");
				System.out.println("(3) Correo");
				System.out.println("(4) Empresa");
				opt = sc.nextInt();
				System.out.println(contactFound.modificar(opt, contactFound));
				break;
			case 3:
				System.out.println(contactFound.llamar());
				break;
			case 4:
				System.out.println(contactFound.eliminar(contact1));
				break;
			default:
				System.out.println("Opción inválida");
				break;
		}

	}// close main

}// close class