package co.edu.konradlorenz.model;

public class Futbolista extends Persona{

	// - // - // - // Attributes //- // - // - //
	private byte dorsal;
	private String equipo;
	
	
	// - // - // - // Constructors //- // - // - //
	public Futbolista() {//VACIO
		super();
	}
	
	public Futbolista(String nombre) {//PERSONA
		super(nombre);
	}
	
	public Futbolista(byte dorsal, String equipo) {//FUTBOLISTA
		super();
		this.dorsal = dorsal;
		this.equipo = equipo;
	}
	
	public Futbolista(String nombre, byte dorsal, String equipo) {//PERSONA + FUTBOLISTA
		super(nombre);
		this.dorsal = dorsal;
		this.equipo = equipo;
	}

	
	// - // - // - // Getters & Setters //- // - // - //
	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	// - // - // - // Methods //- // - // - //
		
		
}
