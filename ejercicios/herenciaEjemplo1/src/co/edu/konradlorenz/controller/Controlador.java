package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Circulo;
import co.edu.konradlorenz.model.Forma;
import co.edu.konradlorenz.model.Rectangulo;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	Vista vista = new Vista();
	Rectangulo rectangulo = new Rectangulo();
	Circulo circulo = new Circulo();
	Forma forma = new Forma();

	public void run() {
		//1. Pedir datos
		while(true) {
			String Continuar = vista.menuPrincipal().toUpperCase();
			if(Continuar.equals("Y")){
				break;
			}else if(Continuar.equals("N")) {
				vista.salida();
				System.exit(0);
			}
		}
		
		
		String tipoFigura;
		
		while(true) {
			String pedirTipoFigura = vista.pedirTipoFigura().toUpperCase();
			if(pedirTipoFigura.equals("R")||pedirTipoFigura.equals("C")) {
				tipoFigura = pedirTipoFigura;
				break;
			}
			vista.ingreseDatoDeNuevo();
		}
		
		//2. Pedir, calcular y mostrar datos
		switch (tipoFigura) {
		case "R":
			rectangulo.setLado1(vista.pedirLado1());
			rectangulo.setLado2(vista.pedirLado2());
			forma.setX(vista.pedirX());
			forma.setY(vista.pedirY());
			
			vista.mostrarArea(rectangulo.Area());
			vista.mostrarPerimetro(rectangulo.Perimetro());
			vista.mostrarUbicacion(forma.getX(),forma.getY());
			break;
			
		case "C":
			circulo.setRadio(vista.pedirRadio());
			forma.setX(vista.pedirX());
			forma.setY(vista.pedirY());
			
			vista.mostrarArea(circulo.Area());
			vista.mostrarPerimetro(circulo.Perimetro());
			vista.mostrarUbicacion(forma.getX(),forma.getY());
			break;
		}
	}
}
