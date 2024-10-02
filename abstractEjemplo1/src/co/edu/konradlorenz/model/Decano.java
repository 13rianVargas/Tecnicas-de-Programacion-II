package co.edu.konradlorenz.model;

public class Decano extends Profesor{
	
	private String facultad;
	
	public Decano() {
		
	}

	/*/ <- Alternar "*" para comentar o descomentar.
	public Decano(String nombre, String cedula, long numeroDeTarjetaProfesional) {
		super(nombre, cedula, numeroDeTarjetaProfesional);
	}

	public Decano(String facultad) {
		this.facultad = facultad;
	}
	//*/
	
	public Decano(String nombre, String cedula, long numeroDeTarjetaProfesional, String facultad) {
		super(nombre, cedula, numeroDeTarjetaProfesional);
		this.facultad = facultad;
	}
	
	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return super.toString() + ", Facultad: " + facultad;
	}

	public String presentarReportes() {
		return "\n <> El Decano " + this.getNombre() + " presentó reportes de su facultad.";
	}
	
}
