package co.edu.konradlorenz.model;

public class Futbolista extends Persona{

	// - // - // - // Attributes //- // - // - //
	private byte dorsal;
	private String equipo;
	
	
	// - // - // - // Constructors //- // - // - //
	public Futbolista() {
		super();
	}
	
	public Futbolista(String nombre) {
		super(nombre);
	}
	
	public Futbolista(byte dorsal, String equipo) {
		super();
		this.dorsal = dorsal;
		this.equipo = equipo;
	}
	
	
	// - // - // - // Methods //- // - // - //
	
}
