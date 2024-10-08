package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Estacion {
	
	private ArrayList<Jugador> listaJugadores = new ArrayList<>();

	public Estacion() {
	}

	public Estacion(ArrayList<Jugador> listaJugadores) {
		super();
		this.listaJugadores = listaJugadores;
	}

	public Jugador getListaJugadores(int index) {
		return listaJugadores.get(index);
	}

	public void setListaJugadores(Jugador jugador) {
		this.listaJugadores.add(jugador);
	}

	@Override
	public String toString() {
		return "Estacion [listaJugadores=" + listaJugadores + "]";
	}

}