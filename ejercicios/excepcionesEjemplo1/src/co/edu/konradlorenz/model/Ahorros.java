package co.edu.konradlorenz.model;

public class Ahorros extends Cuenta {
	int porcentajeInteres;

	public Ahorros(int balance, int porcentajeInteres) {
		super(balance);
		this.porcentajeInteres = porcentajeInteres;
	}
	public int getPorcentajeInteres() {
		return porcentajeInteres;
	}
	public void setPorcentajeInteres(int porcentajeInteres) {
		this.porcentajeInteres = porcentajeInteres;
	}
	@Override
	public String toString() {
		return "Ahorros [porcentajeInteres=" + porcentajeInteres + "]";
	}
}
