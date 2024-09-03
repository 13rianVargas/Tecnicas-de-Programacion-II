package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Circulo;
import co.edu.konradlorenz.model.Rectangulo;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	Vista vista = new Vista();
	Rectangulo rectangulo = new Rectangulo();
	Circulo circulo = new Circulo();

	public void run() {
		//1. Pedir datos
		String tipoFigura;
		
		while(true) {
			String pedirTipoFigura = vista.pedirTipoFigura();
			if(pedirTipoFigura.equals("R")||pedirTipoFigura.equals("C")) {
				tipoFigura = pedirTipoFigura;
				break;
			}
			vista.ingreseDatoDeNuevo();
		}
		
		//2. Pedir, calcular y mostrar datos
		switch (tipoFigura) {
		case "R":
			rectangulo.setLado1(vista.pedirDouble());
			rectangulo.setLado2(vista.pedirDouble());
			
			vista.mostrarArea(rectangulo.Area());
			vista.mostrarPerimetro(rectangulo.Perimetro());
			break;
			
		case "C":
			circulo.setRadio(vista.pedirDouble());
			
			vista.mostrarArea(circulo.Area());
			vista.mostrarPerimetro(circulo.Perimetro());
			break;
		}
		
	}
}
