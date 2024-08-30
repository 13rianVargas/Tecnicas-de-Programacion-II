package co.edu.konradlorenz.model;

public class Arbitro extends Persona{

	// - // - // - // Attributes //- // - // - //
	private String tipoArbitro;

	
	// - // - // - // Methods //- // - // - //
	public Arbitro() {//VACIO
		super();
	}
	
	public Arbitro(String nombre) {//PERSONA
		super(nombre);
	}
	
	/*/ <-- Quitar asterisco para ver error
	public Arbitro(String tipoArbitro) {//ARBITRO
		super();
		this.tipoArbitro = tipoArbitro;
	}//*/
	
	public Arbitro(String nombre, String tipoArbitro) {//PERSONA + ARBITRO
		super(nombre);
		this.tipoArbitro = tipoArbitro;
	}

	
	// - // - // - // Getters & Setters //- // - // - //	
	public String getTipoArbitro() {
		return tipoArbitro;
	}

	public void setTipoArbitro(String tipoArbitro) {
		this.tipoArbitro = tipoArbitro;
	}
	
	
	// - // - // - // Methods //- // - // - //
		
		
		
}

