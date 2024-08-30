package co.edu.konradlorenz.model;

public class DirectorTecnico extends Persona{

	// - // - // - // Attributes //- // - // - //
	private String estrategia;
	
	
	// - // - // - // Methods //- // - // - //
	public DirectorTecnico() {//VACIO
		super();
	}
	
	public DirectorTecnico(String nombre) {//PERSONA
		super(nombre);
	}
	
	/*/ <-- Quitar asterisco para ver error
	public DirectorTecnico(String estrategia) {//DIRECTOR T.
		super();
		this.estrategia = estrategia;
	}//*/
	
	public DirectorTecnico(String nombre, String estrategia) {//PERSONA + DIRECTOR T.
		super(nombre);
		this.estrategia = estrategia;
	}

	
	// - // - // - // Getters & Setters //- // - // - //	
	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
	
	
	// - // - // - // Methods //- // - // - //
	
	
	
}
