package co.edu.konradlorenz.model;

public class Profesor extends Persona implements Empleado{

	private String numeroDeTarjetaProfesional;

	public Profesor() {
		
	}
	
	/*/ <- Alternar "*" para comentar o descomentar.
	public Profesor(String nombre, String cedula) {
		super(nombre, cedula);
	}

	public Profesor(String numeroDeTarjetaProfesional) {
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}
	//*/

	public Profesor(String nombre, String cedula, String numeroDeTarjetaProfesional) {
		super(nombre, cedula);
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}

	public String getNumeroDeTarjetaProfesional() {
		return numeroDeTarjetaProfesional;
	}

	public void setNumeroDeTarjetaProfesional(String numeroDeTarjetaProfesional) {
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
	public boolean cobrarSueldo() {
		return true;
	}

	@Override
	public long pagarImpuestos() {
		long impuesto = (long) (Empleado.SMMLV * 0.19);
		return impuesto;
	}

	@Override
	public String asistirAReunion() {
		return "\n <> El profesor " + this.getNombre() + " asistió a la reunión de cierre de semestre.";
	}

	@Override
	public void registrarEntrada(String actualTime) {
		
	}

	@Override
	public void registrarSalida(String actualTime) {
		
	}
	
}
