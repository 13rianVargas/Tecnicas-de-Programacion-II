package co.edu.konradlorenz.model;

public class Circulo extends Forma{

	// - // - // - // Attributes // - // - // - //
	protected double radio;

	
	// - // - // - // Constructors // - // - // - //
	public Circulo() {//VACIO
		super();
	}
	public Circulo(double radio) {//CIRCULO
		super();
		this.radio = radio;
	}
	public Circulo(double x, double y) {//FORMA
		super(x, y);
	}
	public Circulo(double x, double y, double radio) {//FORMA + CIRCULO
		super(x, y);
		this.radio = radio;
	}
	
	
	// - // - // - // Getters & Setters // - // - // - //
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	// - // - // - // toString // - // - // - //
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	// - // - // - // Methods // - // - // - //
		public double Area() {
			return Math.round(Math.PI*Math.pow(radio,2));
		}
		public double Perimetro() {
			return Math.round(2*Math.PI*radio);
		}	
}
