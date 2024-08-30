package co.edu.konradlorenz.model;

public class Delantero extends Futbolista{
	
	// - // - // - // Attributes //- // - // - //
	
	
	// - // - // - // Constructors //- // - // - //
	public Delantero() {//VACIO
		super();
	}
	
	public Delantero(String nombre) {//PERSONA
		super(nombre);
	}
	
	public Delantero(byte dorsal, String equipo) {//FUTBOLISTA
		super(dorsal, equipo);
	}
	
	public Delantero(String nombre, byte dorsal, String equipo) {//PERSONA + FUTBOLISTA
		super(nombre, dorsal, equipo);
	}
	
	
	// - // - // - // Getters & Setters //- // - // - //
	
	
	// - // - // - // Methods //- // - // - //
	
	
	

}
