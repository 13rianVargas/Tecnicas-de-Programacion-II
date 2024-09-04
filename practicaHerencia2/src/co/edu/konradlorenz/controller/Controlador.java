package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Vista;
import co.edu.konradlorenz.model.Vehiculo;
import co.edu.konradlorenz.model.Coche;
import co.edu.konradlorenz.model.Moto;

public class Controlador {
	Vista vista = new Vista();
	Vehiculo vehiculo = new Vehiculo();
	Coche coche = new Coche();
	Moto moto = new  Moto();

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
		
		
		String tipoVehiculo;
		
		while(true) {
			String pedirTipoVehiculo = vista.pedirTipoVehiculo().toUpperCase();
			if(pedirTipoVehiculo.equals("M")||pedirTipoVehiculo.equals("C")) {
				tipoVehiculo = pedirTipoVehiculo;
				break;
			}
			vista.ingreseDatoDeNuevo();
		}
		
		//2. Pedir, calcular y mostrar datos
		boolean limit;
		switch (tipoVehiculo) {
		case "M":
			vehiculo.setMarca(vista.pedirMarca());
			vehiculo.setModelo(vista.pedirModelo());
			vehiculo.setMatricula(vista.pedirMatricula());
			
			while(true) {
				String pedirLimit = vista.pedirLimitador().toUpperCase();
				if (pedirLimit.equals("S")) {
					limit = true;
					break;
				} else if (pedirLimit.equals("N")) {
					limit = false;
					break;
				}
				vista.ingreseDatoDeNuevo();
			}
			
			moto.setLimitador(limit);
			
			vista.mostrarClaxon(moto.Claxon());
			break;
			
		case "C":
			vehiculo.setMarca(vista.pedirMarca());
			vehiculo.setModelo(vista.pedirModelo());
			vehiculo.setMatricula(vista.pedirMatricula());
			
			coche.setAnchura(vista.pedirAnchura());
			coche.setAltura(vista.pedirAltura());
			
			vista.mostrarClaxon(coche.Claxon());
			break;
		}
	}
}
