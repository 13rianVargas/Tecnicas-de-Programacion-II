package co.edu.konradlorenz.model;

public class Persona{

	// - // - // - // Attributes //- // - // - //
	private String nombre;

	
	// - // - // - // Constructors //- // - // - //
	public Persona() {//VACIO
		super();
	}
	
	public Persona(String nombre) {//PERSONA
		super();
		this.nombre = nombre;
	}

	
	// - // - // - // Getter & Setters //- // - // - //
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	// - // - // - // Methods //- // - // - //
	
	
}
