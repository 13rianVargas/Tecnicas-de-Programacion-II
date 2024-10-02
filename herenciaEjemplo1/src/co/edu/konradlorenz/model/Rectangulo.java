package co.edu.konradlorenz.model;

public class Rectangulo extends Forma{
	
	// - // - // - // Attributes // - // - // - //
	protected double lado1;
	protected double lado2;
	
	
	// - // - // - // Constructors // - // - // - //
	public Rectangulo() {//VACIO
		super();
	}
	public Rectangulo(double lado1, double lado2) {//RECTANGULO
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	/*/ <- Quitar asterísco para ver el error
	public Rectangulo(double x, double y) {//FORMA
		super();
		this.x = x;
		this.y = y;
	}//*/
	public Rectangulo(double x, double y, double lado1, double lado2) {//FORMA + RECTANGULO
		super(x,y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	// - // - // - // Getters & Setters // - // - // - //
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	
	// - // - // - // toString // - // - // - //
	@Override
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
	
	
	// - // - // - // Methods // - // - // - //
	public double Area() {
		return lado1*lado2;
	}
	public double Perimetro() {
		return (lado1+lado2)*2;
	}	
	
	
	
	
}
