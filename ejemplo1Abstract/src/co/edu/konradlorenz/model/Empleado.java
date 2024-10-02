package co.edu.konradlorenz.model;

public interface Empleado {
	
	public final long SMMLV = 1300000;

	public boolean cobrarSueldo();
	public long pagarImpuestos();
	public String asistirAReunion();
	
}
