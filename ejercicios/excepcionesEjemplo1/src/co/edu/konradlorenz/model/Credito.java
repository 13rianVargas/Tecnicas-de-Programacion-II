package co.edu.konradlorenz.model;

import java.util.LinkedList;

public class Credito extends Cuenta {
	LinkedList <TarjetaCredito> listaTarjetas;
	
	public Credito(int balance) {
		super(balance);
		this.listaTarjetas = new LinkedList<>();
	}
	public LinkedList<TarjetaCredito> getListaTarjetas() {
		return listaTarjetas;
	}
	public void setListaTarjetas(LinkedList<TarjetaCredito> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	@Override
	public String toString() {
		return "Credito [listaTarjetas=" + listaTarjetas + "]";
	}
}
