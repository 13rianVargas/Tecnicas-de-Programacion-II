package co.edu.konradlorenz.model;

public class Moto extends Vehiculo {
	
	// - // - // - // Attributes // - // - // - //
	private boolean limitador;
	
	
	// - // - // - // Constructors // - // - // - //
	public Moto() {//VACIO
		super();
	}
	public Moto(boolean limitador) {//MOTO
		super();
		this.limitador = limitador;
	}
	public Moto(String matricula, String marca, String modelo) {//VEHICULO
		super(matricula, marca, modelo);
	}
	public Moto(String matricula, String marca, String modelo, boolean limitador) {//VEHICULO + MOTO
		super(matricula, marca, modelo);
		this.limitador = limitador;
	}
	
	
	// - // - // - // Getters & Setters // - // - // - //
	public boolean isLimitador() {
		return limitador;
	}
	public void setLimitador(boolean limitador) {
		this.limitador = limitador;
	}
	
	
	// - // - // - // toString // - // - // - //
	@Override
	public String toString() {
		return "Moto [limitador=" + limitador + "]";
	}
	
	
	// - // - // - // Methods // - // - // - //
	@Override
	public String Claxon() {
		return "Bep bep";
	}
	
}
