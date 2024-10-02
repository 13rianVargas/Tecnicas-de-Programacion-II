package co.edu.konradlorenz.model;

public interface Empleado {
	
	public final long SMMLV = 1300000;

	public String cobrarSueldo(long SMMLV);
	public String pagarImpuestos();
	public String asistirAReunion();
	
}
