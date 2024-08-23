package miPrimeraAgenda;

import java.util.Scanner;

public class Contacto {
	
	Scanner sc = new Scanner(System.in);
	

	// - // - // - // Atributos // - // - // - //
	private String nombre;
	private long celular;
	private String correo;
	private String empresa;
	

	// - // - // - // Constructor // - // - // - //
	public Contacto(String n, long ce, String co, String e) {
		nombre = n;
		celular = ce;
		correo = co;
		empresa = e;
	}
	
	
	// - // - // - // Getters & Setters // - // - // - //
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	
	// - // - // - // Métodos // - // - // - //
	@Override
	public String toString() {
		return "Contacto [Nombre: " + nombre + ", Celular: " + celular + ", Correo: " + correo + ", Empresa: " + empresa
				+ "]";
	}

	public String agregar(Contacto contact) {
		AplMain.listaDeContactos.add(contact);
		return "\nContact added successfully.\n";
	}
	
	public Contacto buscar(String word) {
		for (Contacto contact : AplMain.listaDeContactos) {
			if (contact.getNombre().equals(word)||String.valueOf(contact.getCelular()).equals(word)||contact.getCorreo().equals(word)||contact.getEmpresa().equals(word)) {
				AplMain.valid = true;
				return contact;
			} else {
				System.out.println("\nContact not found, try again.\n");
				AplMain.valid = false;
			}
		}
		return null;
	}
	
	public String enviarMensaje(String message){
		return "\n Sent: " + message + "\n";
	}
	
	public String modificar(int opt, Contacto contactFound) {
		switch (opt) {
		case 1:
			System.out.println("Ingresa el nuevo nombre:");
			String nom = sc.nextLine();
			contactFound.setNombre(nom);
			return "\nUpdated Successfully \n\n" + contactFound.toString() + "\n";
		case 2:
			System.out.println("Ingresa el nuevo número:");
			long cel = sc.nextLong();
			contactFound.setCelular(cel);
			return "\nUpdated Successfully \n\n" + contactFound.toString() + "\n";
		case 3:
			System.out.println("Ingresa el nuevo correo:");
			String cor = sc.nextLine();
			contactFound.setCorreo(cor);
			return "\nUpdated Successfully \n\n" + contactFound.toString() + "\n";
		case 4:
			System.out.println("Ingresa la nueva empresa:");
			String emp = sc.nextLine();
			contactFound.setEmpresa(emp);
			return "\nUpdated Successfully \n\n" + contactFound.toString() + "\n";
		default:
			return "\nUnexpected value: " + opt;
		}
	}
	
	public String llamar() {
		return "\nCall in progress...\n";
	}
	
	public String eliminar(Contacto contact) {
		AplMain.listaDeContactos.remove(contact);
		return "\nDeleted Successfully.\n";
	}
	
}//close class