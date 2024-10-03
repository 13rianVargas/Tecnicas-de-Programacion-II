package co.edu.konradlorenz.model;

public interface Empleado {
	
	public final long SMMLV = 1300000;

	public abstract boolean cobrarSueldo();
	public abstract long pagarImpuestos();
	public abstract String asistirAReunion();
	
}
