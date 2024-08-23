package co.edu.konradlorenz.model;

public class Estudiante {
	
	// - // - // Attributes // - // - // 
	private String nombres; //Mandatory
	private String apellidos;
	private long codigo; //Mandatory
	private byte edad;
	private String programa; //Mandatory
	private String correo;
	private byte numeroMatricula;
	
	
	// - // - // Constructors // - // - //
	public Estudiante() {

	}

	public Estudiante(String nombres, String apellidos, long codigo, byte edad, String programa, String correo,
			byte numeroMatricula) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.codigo = codigo;
		this.edad = edad;
		this.programa = programa;
		this.correo = correo;
		this.numeroMatricula = numeroMatricula;
	}


	// - // - // Getters & Setters // - // - //
	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public long getCodigo() {
		return codigo;
	}


	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}


	public byte getEdad() {
		return edad;
	}


	public void setEdad(byte edad) {
		this.edad = edad;
	}


	public String getPrograma() {
		return programa;
	}


	public void setPrograma(String programa) {
		this.programa = programa;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public byte getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(byte numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	
	// - // - // toString // - // - //
	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombres + ", apellidos=" + apellidos + ", codigo=" + codigo + ", edad=" + edad
				+ ", programa=" + programa + ", correo=" + correo + ", numeroMatricula=" + numeroMatricula + "]";
	}
	
	
}
