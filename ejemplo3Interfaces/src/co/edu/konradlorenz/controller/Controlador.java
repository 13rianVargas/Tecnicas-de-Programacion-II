package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Telefono;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	Telefono telefono = new Telefono();

	public void run() {
		Vista.mostrarMensaje(telefono.iniciarRadio());
		Vista.mostrarMensaje(telefono.detenerRadio());
		Vista.mostrarMensaje(telefono.obtenerCoordenadas());
	}
}