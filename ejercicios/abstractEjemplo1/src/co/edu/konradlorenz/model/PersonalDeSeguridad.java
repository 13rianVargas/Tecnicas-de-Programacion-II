package co.edu.konradlorenz.model;

public class PersonalDeSeguridad extends Persona implements Empleado, Revolver{
	
	private long numeroDeMatricula;
	private byte balasActuales;

	public PersonalDeSeguridad() {
		
	}
	
	/*/ <- Alternar "*" para comentar o descomentar.
	public PersonalDeSeguridad(String nombre, String cedula) {
		super(nombre, cedula);
	}
	
	public PersonalDeSeguridad(long numeroDeMatricula, byte balasActuales) {
		this.numeroDeMatricula = numeroDeMatricula;
		this.balasActuales = balasActuales;
	}
	
	public PersonalDeSeguridad(String nombre, String cedula, long numeroDeMatricula, byte balasActuales) {
		super(nombre, cedula);
		this.numeroDeMatricula = numeroDeMatricula;
		this.balasActuales = balasActuales;
	}
	//*/
	
	public PersonalDeSeguridad(String nombre, String cedula, long numeroDeMatricula) {
		super(nombre, cedula);
		this.numeroDeMatricula = numeroDeMatricula;
		this.balasActuales = 0;
	}

	public long getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(long numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public byte getBalasActuales() {
		return balasActuales;
	}

	public void setBalasActuales(byte balasActuales) {
		this.balasActuales = balasActuales;
	}

	@Override
	public String toString() {
		return super.toString() + ", Número de matrícula: " + numeroDeMatricula;
	}

	@Override
	public String disparar() {
		if(balasActuales == 0) {
			balasActuales = NUMERO_BALAS;
		}
		balasActuales--;
		return "\n¡Bang!";
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
		return "\n <> El personal de seguridad " + this.getNombre() + " asistió a la reunión de cierre de semestre.";
	}

	@Override
	public void registrarEntrada(String actualTime) {
		// TODO Auto-generated method stub
	}

	@Override
	public void registrarSalida(String actualTime) {
		// TODO Auto-generated method stub
	}
	
}
