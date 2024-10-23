package co.edu.konradlorenz.controller;

import java.util.InputMismatchException;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	Dato dato = new Dato();

    public void run() {
    	
    	while(true) {
	    	try {
	    		dato.setEntero(Vista.pedirEntero());
	    		break;
			} catch (InputMismatchException e) {
				Vista.mostrarMensaje("El dato ingresado no es un entero. Excepción: " + e + "\n");
				e.printStackTrace(); //Imprimir bloque completo de la excepción
			} catch (Exception e) {
				Vista.mostrarMensaje("Excepción: " + e + "\n");
				e.printStackTrace(); //Imprimir bloque completo de la excepción
			} finally {
				Vista.mostrarMensaje("Pasó al finally");
			}
		}
    	//while
    }
    //run
}
//run
