package co.edu.konradlorenz.model;

public abstract class Persona {
	private String nombre;
	private String cedula;
	
	protected Persona() {
	}
	
	protected Persona(String nombre, String cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "<> | Nombre: " + nombre + ", Cédula: " + cedula;
	}

	public String registrarEntrada(String actualTime) {
		return "\n <> " + this.nombre + " registró su entrada [" + actualTime + "]";
	}
	
	public String  registrarSalida(String actualTime) {
		return "\n <> " + this.nombre + " registró su salida [" + actualTime + "]";
	}
	
}