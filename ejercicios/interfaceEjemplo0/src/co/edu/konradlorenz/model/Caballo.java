package co.edu.konradlorenz.model;

public class Caballo extends SerVivo implements MedioDeTransporte, Juguete{
	private int herradura = 4;
	private boolean sillaDeMontar;
	
	public Caballo() {
		super();
	}
	public Caballo(String nombre) {
		super(nombre);
	}
	public Caballo(int herradura, boolean sillaDeMontar) {
		super();
		this.herradura = herradura;
		this.sillaDeMontar = sillaDeMontar;
	}
	public Caballo(String nombre, int herradura, boolean sillaDeMontar) {
		super(nombre);
		this.herradura = herradura;
		this.sillaDeMontar = sillaDeMontar;
	}
	
	public int getHerradura() {
		return herradura;
	}
	public void setHerradura(int herradura) {
		this.herradura = herradura;
	}
	public boolean isSillaDeMontar() {
		return sillaDeMontar;
	}
	public void setSillaDeMontar(boolean sillaDeMontar) {
		this.sillaDeMontar = sillaDeMontar;
	}
	
	@Override
	public String toString() {
		return "Caballo [herradura=" + herradura + ", sillaDeMontar=" + sillaDeMontar + ", getNombre()=" + getNombre()
				+ "]";
	}
	
	@Override
	public String alimentar(String tipoDeComida) {
		return "Come zanahorias, pasto y " + tipoDeComida;
	}
	
	@Override
	public void arrancar() {
		
	}
	@Override
	public String frenar() {
		return "Halando las riendas";
	}
		
}
