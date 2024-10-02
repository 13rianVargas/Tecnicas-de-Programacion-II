package co.edu.konradlorenz.model;

public class Profesor extends Persona implements Empleado{

	private long numeroDeTarjetaProfesional;

	public Profesor() {
		
	}
	
	/*/ <- Alternar "*" para comentar o descomentar.
	public Profesor(String nombre, String cedula) {
		super(nombre, cedula);
	}

	public Profesor(long numeroDeTarjetaProfesional) {
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}
	//*/

	public Profesor(String nombre, String cedula, long numeroDeTarjetaProfesional) {
		super(nombre, cedula);
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}

	public long getNumeroDeTarjetaProfesional() {
		return numeroDeTarjetaProfesional;
	}

	public void setNumeroDeTarjetaProfesional(long numeroDeTarjetaProfesional) {
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}

	@Override
	public String toString() {
		return super.toString() + ", Número de tarjeta profesional: " + numeroDeTarjetaProfesional;
	}

	public String dictarClase() {
		return "\n <> El profesor " + this.getNombre() + " está dictando la clase.";
	}

	@Override
	public String cobrarSueldo(long SMMLV) {
		return "\n <> El profesor " + this.getNombre() + " cobró el sueldo de [$" + SMMLV + "].";
	}

	@Override
	public String pagarImpuestos() {
		return "\n <> El profesor " + this.getNombre() + " pagó sus impuestos.";
	}

	@Override
	public String asistirAReunion() {
		return "\n <> El profesor " + this.getNombre() + " asistió a la reunión de cierre de semestre.";
	}
	
}
