package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Ventana;
import co.edu.konradlorenz.model.DuaLipa;
import co.edu.konradlorenz.model.Persona;

public class Controlador {
	protected Persona persona = new Persona();
	protected DuaLipa duaPipa = new DuaLipa();
	public void run() {
		Ventana.mostrarMensaje(persona.cantar());
		Ventana.mostrarMensaje(duaPipa.cantar());
	}
}
