package co.edu.konradlorenz.model;

public class Medida {
	private double valor;
	
	public Medida () {
		this.valor = 0;
	}
	public Medida (double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Medida [valor=" + valor + "]";
	}
	public double convEnCm() {
		return this.valor*100;
	}
}
