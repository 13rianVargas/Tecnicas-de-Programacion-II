package co.edu.konradlorenz.model;

public class Forma {

    
	// - // - // - // Attributes // - // - // - //
    public double x;
    public double y;
	
    
	// - // - // - // Constructors // - // - // - //
    public Forma() {
    	super();
    }
    public Forma(double x, double y) {
    	super();
    	this.x = x;
    	this.y = y;
    }
    
    
	// - // - // - // Getters & Setters // - // - // - //
    public double getX() {
		return x;
	}
    public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	// - // - // - // toString // - // - // - //
	@Override
	public String toString() {
		return "Forma [x=" + x + ", y=" + y + "]";
	}
	
    
	// - // - // - // Methods // - // - // - //
	public double Area() {
		return 0;
	}
	public double Perimetro() {
		return 0;
	}
	
}
