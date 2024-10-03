package co.edu.konradlorenz.model;

public class Coche extends Vehiculo{
	
	// - // - // - // Attributes // - // - // - //
	private int anchura;
	private int altura;
	
	
	// - // - // - // Constructors // - // - // - //
	public Coche() {//VACIO
		super();
	}
	public Coche(int anchura, int altura) {//COCHE
		super();
		this.anchura = anchura;
		this.altura = altura;
	}
	public Coche(String matricula, String marca, String modelo) {//VEHICULO
		super(matricula, marca, modelo);
	}
	public Coche(String matricula, String marca, String modelo, int anchura, int altura) {//VEHICULO + COCHE
		super(matricula, marca, modelo);
		this.anchura = anchura;
		this.altura = altura;
	}
	
	
	// - // - // - // Getters & Setters // - // - // - //
	public int getAnchura() {
		return anchura;
	}
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	// - // - // - // toString // - // - // - //
	@Override
	public String toString() {
		return "Coche [anchura=" + anchura + ", altura=" + altura + "]";
	}
	
	
	// - // - // - // Methods // - // - // - //
	@Override
	public String Claxon() {
		return "BEEP BEEP";
	}
	
}
