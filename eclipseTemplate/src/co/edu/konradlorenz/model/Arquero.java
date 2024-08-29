package co.edu.konradlorenz.model;

public class Arquero extends Futbolista{
	
	// - // - // - // Attributes //- // - // - //
	
	private String colorGuantes;

	// - // - // - // Constructors //- // - // - //

	public Arquero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Arquero(byte dorsal, String equipo) {
		super(dorsal, equipo);
		// TODO Auto-generated constructor stub
	}
	
	public Arquero(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Arquero(String nombre, String colorGuantes) {
		super(nombre);
		this.colorGuantes = colorGuantes;
	}
	
	//FALTA UNO XD
	
	
	
	
	// - // - // - // Getters & Setters //- // - // - //
	
	// - // - // - // Methods //- // - // - //
	
}
