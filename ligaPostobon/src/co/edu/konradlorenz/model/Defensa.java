package co.edu.konradlorenz.model;

public class Defensa extends Futbolista{
	
	// - // - // - // Attributes //- // - // - //
	
	
	// - // - // - // Constructors //- // - // - //
	public Defensa() {//VACIO
		super();
	}
	
	public Defensa(String nombre) {//PERSONA
		super(nombre);
	}
	
	public Defensa(byte dorsal, String equipo) {//FUTBOLISTA
		super(dorsal, equipo);
	}
	
	public Defensa(String nombre, byte dorsal, String equipo) {//PERSONA + FUTBOLISTA
		super(nombre, dorsal, equipo);
	}
	
	
	// - // - // - // Getters & Setters //- // - // - //
	
	
	// - // - // - // Methods //- // - // - //
	
	
	
}
