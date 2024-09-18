package co.edu.konradlorenz.model;

public class SerVivo {
	private String nombre;

	public SerVivo() {
	}
	public SerVivo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "SerVivo [nombre=" + nombre + "]";
	}
	
	public String alimentar (String tipoDeComida) {
		return "Se alimenta de " + tipoDeComida;
	}
	
}
