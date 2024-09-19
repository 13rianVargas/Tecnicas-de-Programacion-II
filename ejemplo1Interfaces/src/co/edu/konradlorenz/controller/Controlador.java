package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Ventana;
import co.edu.konradlorenz.model.Circulo;

public class Controlador {
	protected Circulo circulo = new Circulo();

	public void run() {
		
		Ventana.mostrarMensaje("Ingrese radio del círculo: ");
		double radio = Ventana.pedirDouble();
		Circulo newCirculo = crearCirculo(radio);
		
		double area = newCirculo.area();
		Ventana.mostrarMensaje("El area del círculo es: " + area);
	}
	
	public Circulo crearCirculo(double radio) {
		Circulo circulo = new Circulo(radio);
		return circulo;
	}
	
}
