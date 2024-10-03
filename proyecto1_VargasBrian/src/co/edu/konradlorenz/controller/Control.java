package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Ventana;

public class Control {

	protected Jugador objJugador = new EstudianteJugador();
	protected Estacion objEstacion = new Estacion();

	public void run() {
		
		byte key = 0;

		do {
			key = Ventana.mostrarMenu();

			switch (key) {
			case 0:
				Ventana.mostrarMensaje("Seleccionó salir, hasta pronto.");
				break;
			case 1:
				Ventana.mostrarMensaje("Seleccionó asignar jugador.");
				crearJugadorConConstructor();
				break;
			case 2:
				Ventana.mostrarMensaje("Seleccionó mostrar jugador.");
				break;
			}
		} while (key != 0);

	}

	public void crearJugadorConConstructor() {
		objJugador = new EstudianteJugador(Ventana.pedirString("nombre"),
				Long.parseLong(Ventana.pedirString("identificación")), Ventana.pedirString("fecha"),
				Long.parseLong(Ventana.pedirString("código")));
		objEstacion.setListaJugadores(objJugador);
	}

	public void crearJugadorConSetter() {
		objJugador = new EstudianteJugador();

		objJugador.setNombre(Ventana.pedirString("nombre"));
		objJugador.setIdentificacion(Long.parseLong(Ventana.pedirString("identificación")));
		objJugador.setFecha(Ventana.pedirString("fecha"));
		objJugador.setIdentificacion(Long.parseLong(Ventana.pedirString("código")));

	}
}
