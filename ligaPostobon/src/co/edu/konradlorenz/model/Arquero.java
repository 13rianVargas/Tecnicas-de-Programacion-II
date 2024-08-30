package co.edu.konradlorenz.model;

public class Arquero extends Futbolista{
	
	// - // - // - // Attributes //- // - // - //
	private String colorGuantes;

	// - // - // - // Constructors //- // - // - //
	public Arquero() {//VACIO
		super();
	}
	
	public Arquero(String nombre) {//PERSONA
		super(nombre);
	}
	
	public Arquero(byte dorsal, String equipo) {//FUTBOLISTA
		super(dorsal, equipo);
	}
	
	/*/Descomentar para ver error
	 public Arquero(String colorGuantes) {//ARQUERO
	
		super();
		this.colorGuantes = colorGuantes;
	}
	//*/
	
	public Arquero(String nombre, byte dorsal, String equipo) {//PERSONA + FUTBOLISTA
		super(nombre, dorsal, equipo);
	}
	
	public Arquero(String nombre, byte dorsal, String equipo, String colorGuantes) {//PERSONA + FUTBOLISTA + ARQUERO
		super(nombre, dorsal, equipo);
		this.colorGuantes = colorGuantes;
	}
	
	
	// - // - // - // Getters & Setters //- // - // - //
	
	// - // - // - // Methods //- // - // - //
	
}
