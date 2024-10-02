package co.edu.konradlorenz.model;

public class Vehiculo {

	// - // - // - // Attributes // - // - // - //
	private String matricula;
	private String marca;
	private String modelo;
	
	
	// - // - // - // Constructors // - // - // - //
	public Vehiculo() {//VACIO
		super();
	}
	public Vehiculo(String matricula, String marca, String modelo) {//VEHICULO
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	// - // - // - // Getters & Setters // - // - // - //
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	// - // - // - // toString // - // - // - //
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}


	// - // - // - // Methods // - // - // - //
	public String Claxon() {
		return "";
	}
	
	
}
