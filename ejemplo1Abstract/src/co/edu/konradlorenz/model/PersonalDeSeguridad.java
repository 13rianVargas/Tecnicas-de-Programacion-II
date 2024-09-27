package co.edu.konradlorenz.model;

public class PersonalDeSeguridad extends Persona implements Empleado, Revolver{
	
	private long numeroDeMatricula;

	public PersonalDeSeguridad() {
	}
	
	public PersonalDeSeguridad(long numeroDeMatricula) {
		super();
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public long getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(long numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	@Override
	public String disparar() {
		return "piu piu";
	}
		
}
